package com.changgou.util;

import com.changgou.file.FastDFSFile;
import org.csource.fastdfs.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;

public  class   FastDFSUtil {

    @Autowired
    public  TrackerServer trackerServer;

    @Autowired
    public  StorageClient storageClient;
    /**
     * 加载Tracher链接信息
     */
    static {
        try {
            String filename = new ClassPathResource("fdfs_client.conf").getPath();

            //加载Tracher链接信息
            ClientGlobal.init(filename);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取StorageClient对象
     * @return
     * @throws IOException
     */
    public static StorageClient getStorageClient() throws IOException {
        //创建一个Tracker访问的客户端读写TrackerClient
        TrackerClient trackerClient = new TrackerClient();

        //通过TrackerClient访问TrackerServe服务，获取连接信息
        TrackerServer trackerServer = trackerClient.getConnection();
        //通过TrackerServer的链接信息可以获取Storage的链接信息，创建StorageClient对象存储Stroage的链接对象
        return new StorageClient(trackerServer, null);

    }

    /**
     * 获取StorageServer信息
     * @return
     * @throws Exception
     */
    public static StorageServer getStorage() throws Exception{
        TrackerClient trackerClient = new TrackerClient();

        TrackerServer trackerServer = trackerClient.getConnection();

        return trackerClient.getStoreStorage(trackerServer);
    }

    /**
     * 获取TrackerServer信息
     * @return
     * @throws Exception
     */
    public static String getTrackerInfo() throws Exception {
        TrackerClient trackerClient = new TrackerClient();
        TrackerServer trackerServer = trackerClient.getConnection();
        InetAddress address = trackerServer.getInetSocketAddress().getAddress();
        int port = ClientGlobal.getG_tracker_http_port();
        return "http://"+address+":"+port;

    }

    /**
     * 文件上传
     */
    public static String[] upload(FastDFSFile fastDFSFile) throws Exception {

        /**
         * 参数1：上传文件的字节数组
         * 参数2：文件的扩展名
         * 参数3附加参数 比如拍摄地址：北京
         */
        //通过StorageClient访问Storage，实现文件上传，并且获取文件上传后的存储信息
        return getStorageClient().upload_file(fastDFSFile.getContent(), fastDFSFile.getExt(), null);
    }

    /**
     * 获取文件的信息
     */
    public static FileInfo getFiles(String groupName, String fileName) throws Exception {
        return getStorageClient().get_file_info(groupName, fileName);
    }

    /**
     * 文件下载
     */
    public static InputStream downFile(String groupName, String fileName) throws Exception {
        byte[] bytes = getStorageClient().download_file(groupName, fileName);
        return new ByteArrayInputStream(bytes);
    }

    /**
     * 文件删除
     */
    public static void deleteFiles(String groupName, String fileName) throws Exception {
        getStorageClient().delete_file(groupName, fileName);
    }

    public static void main(String[] args) throws Exception {
        //rB4ADV6R-ReAXK_IAAEIoR_bSPo782.png
//        FileInfo fileInfo = getFiles("group1", "M00/00/00/rB4ADV6R-ReAXK_IAAEIoR_bSPo782.png");
//        System.out.println(fileInfo.getSourceIpAddr());
//        System.out.println(fileInfo.getFileSize());
           // deleteFiles("group1", "M00/00/00/rB4ADV6R-ReAXK_IAAEIoR_bSPo782.png");
        System.out.println(getTrackerInfo());
    }
}

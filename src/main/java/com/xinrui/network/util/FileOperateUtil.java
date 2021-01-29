package com.xinrui.network.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class FileOperateUtil {

    public synchronized static boolean createFile(String path) {
        boolean flag = false;
        try {
            File file = new File(path);
            if (!file.exists()) {
                if (file.createNewFile()) {
                    flag = true;
                }
            } else {
            }
        } catch (Exception e) {
        }
        return flag;
    }

    public synchronized static boolean createFile(String path, String fileContent) {
        boolean flag = false;
        try {
            File myFilePath = new File(path);
            if (!myFilePath.exists()) {
                myFilePath.createNewFile();
            }
            FileWriter resultFile = new FileWriter(myFilePath);
            PrintWriter myFile = new PrintWriter(resultFile);
            myFile.println(fileContent);
            myFile.close();
            resultFile.close();
            flag = true;
        } catch (Exception e) {
        }
        return flag;
    }

    public synchronized static boolean createFile(String path, String fileContent, String encoding) {
        boolean flag = false;
        try {
            File myFilePath = new File(path);
            if (!myFilePath.exists()) {
                myFilePath.createNewFile();
            }
            PrintWriter myFile = new PrintWriter(myFilePath, encoding);
            String strContent = fileContent;
            myFile.println(strContent);
            myFile.close();
            flag = true;
        } catch (Exception e) {
        }
        return flag;
    }

    public synchronized static boolean createDirectory(String path) {
        boolean flag = false;
        try {
            File file = new File(path);
            if (!file.exists()) {
                if (file.mkdirs()) {
                    flag = true;
                }
            } else {
            }
        } catch (Exception e) {
        }
        return flag;
    }

    public synchronized static boolean deleteFile(String path) {
        boolean flag = false;
        try {
            File file = new File(path);
            if (file.exists()) {
                flag = file.delete();
                if (!flag) {
                }
            }
        } catch (Exception e) {
        }
        return flag;
    }

    @SuppressWarnings("unused")
    private synchronized static boolean deleteRecursionDir(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteRecursionDir(new File(dir, children[i]));
                if (!success)
                    return false;
            }
        }
        // 目录此时为空，可以删除
        return dir.delete();
    }

    @SuppressWarnings("resource")
    public synchronized static boolean copySingleFile(String oldPath, String newPath) {
        boolean flag = false;
        try {
            new File(newPath).mkdirs();
            int bytesum = 0;
            int byteread = 0;
            File oldfile = new File(oldPath);
            if (oldfile.exists()) { // 文件存在时
                InputStream inStream = new FileInputStream(oldPath); // 读入原文件
                FileOutputStream fs = new FileOutputStream(newPath);
                byte[] buffer = new byte[1024];
                while ((byteread = inStream.read(buffer)) != -1) {
                    bytesum += byteread; // 字节数 文件大小
                    System.out.println(bytesum);
                    fs.write(buffer, 0, byteread);
                }
                inStream.close();
                flag = true;
            }
        } catch (Exception e) {
        }
        return flag;
    }

    public synchronized static void copyDirectory(String oldPath, String newPath) {
        try {
            new File(newPath).mkdirs(); // 如果文件夹不存在 则建立新文件夹
            File a = new File(oldPath);
            String[] file = a.list();
            File temp = null;
            for (int i = 0; i < file.length; i++) {
                if (oldPath.endsWith(File.separator)) {
                    temp = new File(oldPath + file[i]);
                } else {
                    temp = new File(oldPath + File.separator + file[i]);
                }
                if (temp.isFile()) {
                    FileInputStream input = new FileInputStream(temp);
                    FileOutputStream output = new FileOutputStream(newPath + "/" + (temp.getName()).toString());
                    byte[] b = new byte[1024 * 5];
                    int len;
                    while ((len = input.read(b)) != -1) {
                        output.write(b, 0, len);
                    }
                    output.flush();
                    output.close();
                    input.close();
                }
                if (temp.isDirectory()) {// 如果是子文件夹
                    copyDirectory(oldPath + "/" + file[i], newPath + "/" + file[i]);
                }
            }
        } catch (Exception e) {
        }
    }

    public synchronized static void moveFile(String oldPath, String newPath) {
        copySingleFile(oldPath, newPath);
        deleteFile(oldPath);
    }

    public void moveDirectory(String oldPath, String newPath) {
        copyDirectory(oldPath, newPath);
        deleteFile(oldPath);
    }

    public synchronized static void write(String path, String content, String encoding) throws IOException {
        try {
            File file = new File(path);
            file.delete();
            file.createNewFile();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), encoding));
            writer.write(content);
            writer.close();
        } catch (Exception e) {
        }
    }

    public synchronized static List<String> read(String path, String encoding) throws IOException {
        List<String> content = new ArrayList<String>();
        try {
            File file = new File(path);
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), encoding));
            String line = null;
            while ((line = reader.readLine()) != null) {
                content.add(line);
            }
            reader.close();
        } catch (Exception e) {
        }
        return content;
    }

    public synchronized static String read(String path, String separator, String encoding) throws IOException {
        StringBuffer content = new StringBuffer();
        try {
            File file = new File(path);
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), encoding));
            String line = null;
            while ((line = reader.readLine()) != null) {
                content.append(line + separator);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    public synchronized static void appendContent(String fileName, String content) {
        try {
            // 打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件
            FileWriter writer = new FileWriter(fileName, true);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
        }
    }

    public synchronized static void appendContentByStream(String fileName, String content) {
        try {
            // 打开一个随机访问文件流，按读写方式
            RandomAccessFile randomFile = new RandomAccessFile(fileName, "rw");
            // 文件长度，字节数
            long fileLength = randomFile.length();
            // 将写文件指针移到文件尾。
            randomFile.seek(fileLength);
            randomFile.writeBytes(content);
            randomFile.close();
        } catch (IOException e) {
        }
    }

    public static void main(String[] args) throws IOException {

    }
}

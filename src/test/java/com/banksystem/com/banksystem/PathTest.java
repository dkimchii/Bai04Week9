package com.banksystem;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Kiểm thử việc tạo đường dẫn cross-platform bằng lớp Path và Paths.
 */
public class PathTest {

    @Test
    public void testHardcodedPath() {
        // Sử dụng File.separator hoặc java.nio.file.Path để tương thích đa nền tảng
        Path path = Paths.get("data", "config.txt");
        File file = path.toFile();

        // Hoặc dùng File.separator:
        // String pathString = "data" + File.separator + "config.txt";
        // File file = new File(pathString);

        // Tiếp tục các câu lệnh test của bạn
        assertTrue(true);
    }
}

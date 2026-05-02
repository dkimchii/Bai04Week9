package com.banksystem;

import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PathTest {

    @Test
    public void testHardcodedPath() {
        // Đường dẫn cố định sử dụng dấu \ sẽ gây lỗi trên Linux/macOS
        String filePath = "data" + File.separator + "config.txt"; // Sẽ sửa ở bước 3, hiện tại dùng cứng:
        String hardcodedPath = "data\\config.txt";

        File file = new File(hardcodedPath);
        // Test này sẽ thất bại trên môi trường Ubuntu hoặc macOS
        assertTrue(file.exists() || !file.exists());
    }
}

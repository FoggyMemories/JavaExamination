package com.mobile.util;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import java.util.HashMap;

public class CharQrUtil {
    public static void PrintCode(String args) {

        printQRcode(args);
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static void printQRcode(String content) {
        int width = 1; // 二维码宽度
        int height = 1; // 二维码高度

        // 定义二维码的参数
        HashMap<EncodeHintType, java.io.Serializable> hints = new HashMap<EncodeHintType, java.io.Serializable>();
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");//编码方式
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);//纠错等级

        // 打印二维码
        try {
            BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height, hints);
            //StringBuilder sb = new StringBuilder("");
            for (int j = 0; j < bitMatrix.getHeight(); j++) {
                for (int i = 0; i < bitMatrix.getWidth(); i++) {
                    if (bitMatrix.get(i, j)) {
                        System.out.print(ANSI_BLACK_BACKGROUND + "  " + ANSI_RESET);

                    } else {
                        System.out.print(ANSI_WHITE_BACKGROUND + "  " + ANSI_RESET);

                    }

                }
                System.out.println();

            }

        } catch (WriterException e) {
            e.printStackTrace();
        }
    }
}

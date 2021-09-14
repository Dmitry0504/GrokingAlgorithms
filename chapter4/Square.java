package chapter4;

public class Square {
    public static void main(String[] args) {
        System.out.println(size(1680, 640));
    }

    // дан участок со сторонами length и width
    // необходимо разделить участок на равные квадраты
    // максимально возможного размера
    public static int size(int length, int width) {
        // если длина кратна ширине возвращаем ширину
        // это будет максимальная сторона квадрата
        if (length % width == 0)
            return width;
        else {
            return size(width, length%width);
        }
    }
}

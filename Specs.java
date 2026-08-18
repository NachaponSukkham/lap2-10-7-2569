package lab;

/**
 * ==========================================================================
 *  ส่วน B — ฝึกเขียน Spec (JavaDoc) เอง
 * --------------------------------------------------------------------------
 *  โค้ดข้างล่างนี้ "ทำงานถูกต้องแล้ว" — ห้ามแก้ตัวโค้ด
 *  หน้าที่ของนิสิต: อ่านโค้ด แล้วเติม JavaDoc ให้แต่ละเมธอด
 *
 *  ต้องมีอย่างน้อย:
 *    - บรรทัดสรุปว่าเมธอด "ทำอะไร" (what, ไม่ใช่ how)
 *    - @param   ของทุกพารามิเตอร์ พร้อมข้อจำกัด (pre-condition)
 *    - @return  อธิบายค่าที่คืน (post-condition)
 *    - @throws  ทุก exception ที่โยน พร้อมเงื่อนไข
 * ==========================================================================
 */
public class Specs {
/**
 * ค้นหาตำแหน่งแรกที่พบค่าที่กำหนดในอาร์เรย์
 *
 * @param arr อาร์เรย์ที่ต้องการค้นหา ต้องไม่เป็น null
 * @param key ค่าที่ต้องการค้นหา
 * @return ตำแหน่งแรกที่พบ key หรือ -1 หากไม่พบ key
 * @throws IllegalArgumentException ถ้า arr เป็น null
 */
public static int firstIndexOf(int[] arr, int key) {
    if (arr == null) throw new IllegalArgumentException("arr must not be null");
    for (int i = 0; i < arr.length; i++)
        if (arr[i] == key) return i;
    return -1;
}
/**
 * คำนวณพื้นที่ของวงกลมจากรัศมีที่กำหนด
 *
 * @param radius รัศมีของวงกลม ต้องมีค่ามากกว่าหรือเท่ากับ 0
 * @return พื้นที่ของวงกลม
 * @throws IllegalArgumentException ถ้า radius มีค่าน้อยกว่า 0
 */
public static double circleArea(double radius) {
    if (radius < 0) throw new IllegalArgumentException("radius must be >= 0");
    return Math.PI * radius * radius;
}
/**
 * ตัดช่องว่างด้านหน้าและด้านหลังของข้อความ และแปลงข้อความเป็นตัวพิมพ์เล็ก
 *
 * @param s ข้อความที่ต้องการปรับรูปแบบ สามารถเป็น null ได้
 * @return ข้อความที่ตัดช่องว่างและแปลงเป็นตัวพิมพ์เล็กแล้ว หรือคืนข้อความว่างถ้า s เป็น null
 */
public static String normalize(String s) {
    if (s == null) return "";
    return s.trim().toLowerCase();
}
}
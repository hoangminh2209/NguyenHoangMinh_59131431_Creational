/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author Dell
 */
public class Bt3Main {

      public static void main(String[] args) 
        {
            ShapeFactory shape = new ShapeFactory();

            Shape circle1 = shape.createShape(ShapeType.Circle);
            
            circle1.setBrush("Vẽ bằng bút chì");
            circle1.setFrame("Khung tròn ");
            circle1.setPaper("giấy a4");
            System.out.println(circle1.toString());

            Shape circle2 = Circle.createInstance();
            circle2.setBrush("Vẽ bằng bút mực");
            circle2.setFrame("Vẽ khung tròn méo");
            circle2.setPaper("giấy a3");
            System.out.println(circle2.toString());

            Shape rectangle1 = shape.createShape(ShapeType.Rectangle);
            rectangle1.setBrush("Vẽ bằng cọ");
            rectangle1.setFrame("Vẽ không cần khung");
            rectangle1.setPaper("Vẽ trên giấy A4");
            System.out.println(rectangle1.toString());
            
            Shape rectangle2 = shape.createShape(ShapeType.Rectangle);
            rectangle2.setPaper("Vẽ trên tường");
            System.out.println(rectangle2.toString());
    }
    
}

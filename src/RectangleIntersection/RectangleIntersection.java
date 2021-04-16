package RectangleIntersection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RectangleIntersection {
    public static Rectangle intersectRectangle(Rectangle R1 , Rectangle R2) {
        if (!islntersect(R1, R2)) {
            return new Rectangle(0, 0, -1, -1); // No intersection.
        }
        return new Rectangle(
                Math.max(R1.x, R2.x), Math.max(R1.y, R2.y),
                Math.min(R1.x + R1.width, R2.x + R2.width)
                        -
                        Math.max(R1.x, R2.x),
                Math.min(R1.y + R1.height, R2.y + R2.height)
                        -
                        Math.max(R1.y, R2.y));
    }
    public static boolean islntersect(Rectangle Rl , Rectangle R2) {
        return Rl.x <= R2.x + R2.width && Rl.x + Rl.width >= R2.x
                && Rl.y <= R2.y + R2.height && Rl.y + Rl. height >= R2.y;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader Reader =new BufferedReader(new InputStreamReader(System.in));
        Rectangle rectangle[] = new Rectangle[3];
        for(int i=0;i<=1;i++){
            int x,y,width,height;
            System.out.println("Enter Height of Rectangle "+(i+1)+" : ");
            height = Integer.parseInt(Reader.readLine());
            System.out.println("Enter Width of Rectangle "+(i+1)+" : ");
            width = Integer.parseInt(Reader.readLine());
            System.out.println("Enter x-Coordinate of Rectangle "+(i+1)+" : ");
            x = Integer.parseInt(Reader.readLine());
            System.out.println("Enter y-Coordinate of Rectangle "+(i+1)+" : ");
            y = Integer.parseInt(Reader.readLine());
            rectangle[i] = new Rectangle(x,y,width,height);
        }
        rectangle[2]=intersectRectangle(rectangle[0],rectangle[1]);
        System.out.println("Intersection Rectangle \nx - Coordinate : "+rectangle[2].x+"\ny - Coordinate : "+rectangle[2].y+"\nWidth : "+rectangle[2].width+"\nHeight : "+rectangle[2].height );
    }
}

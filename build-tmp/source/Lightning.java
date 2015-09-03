import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int endX = 0;
int endY = 150;
int startX = 0;
int startY = 150;
int numMousePressed = 0;

public void setup()
{
  size(300,300);
  strokeWeight(1);
  background(0);
  noLoop();
}

public void draw()
{
	stroke((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
	while (endX<=300) {
		endX = startX + (int)(Math.random()*10);
		endY = startY + (int)(Math.random()*18)-9;
		line(startY, startX, endY, endX);
		startX=endX;
		startY=endY;
	}
}

public void mousePressed()
{
	numMousePressed++;

	if (numMousePressed == 7) {
		setup();
		numMousePressed = 0;
	}

	else {
			startX=0;
			startY=150;
			endX=0;
			endY=150;
			redraw();
}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}

int endX = 0;
int endY = 150;
int startX = 0;
int startY = 150;

void setup()
{
  size(300,300);
  strokeWeight(1);
  background(225);
  noLoop();
}

void draw()
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

void mousePressed()
{
	startX=0;
	startY=150;
	endX=0;
	endY=150;
	redraw();
}

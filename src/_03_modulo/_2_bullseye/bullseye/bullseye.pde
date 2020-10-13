
void setup() {
 
  // set the size of your sketch
  size (400,400);
}

void draw() {

  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for (int i = 100; i > 0; i-=9) {
    if (i % 2 == 0) {
       fill(#0F0808);
    }
    else{
    fill (#F70A3A);
    }
      ellipse(125 ,125, i + 30, i + 30);
}
  //Use an if statement and modulo to alternate the color of your rings.
  
  
}

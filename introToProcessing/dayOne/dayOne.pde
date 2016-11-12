void setup(){
size(1000,1000);
background(10,0,255);
fill(0,0,0);
ellipse(500,500,200,200);
}
void draw(){
  if(mousePressed){
background(255,255,255);
fill(random(255),random(255),random(255));
ellipse(500,500,200,200);
  }
  else{
  background(255,255,255);
  fill(0,0,0);
  ellipse(500,500,200,200);
  }
}

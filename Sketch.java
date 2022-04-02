import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1200, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
    /*
    stroke(128);
    line(150, 25, 270, 350);  

    stroke(255);
    line(50, 125, 70, 50);  
*/
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

  }

  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * draws the bottom left section
   */
  public void draw_section1(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 3 + intRow * 300 / 30;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = 3 + 300 + intColumn * 300 / 30; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }
  
  public void draw_section2(){

  int drawSectionTwoX = 0;
  int drawSectionTwoY = 0;

  for(int drawSectionTwoRow = 0; drawSectionTwoRow < 30; drawSectionTwoRow++)
  { 
  for(int drawSectionTwoColumn = 0; drawSectionTwoColumn < 30; drawSectionTwoColumn++)
  {
  drawSectionTwoX = 3 + 300 + drawSectionTwoRow * 300 / 30;
  drawSectionTwoY = 3 + 300 + drawSectionTwoColumn * 300 / 30;

  if(drawSectionTwoRow % 2 == 0)
  {
    fill(255);
    noStroke();
    rect(drawSectionTwoX, drawSectionTwoY, 5, 5);
  } else {
    fill(0);
    noStroke();
    rect(drawSectionTwoX, drawSectionTwoY, 5, 5);
    }
    }
  }
}

  /**
   * Use the modulus operator and an if/else statement to select the color.
   * Don't use multiple 'if' statements.
   */
  public void draw_section3(){
  int drawSectionThreeX = 0;
  int drawSectionThreeY = 0;
  for(int drawSectionThreeRow = 0; drawSectionThreeRow < 30; drawSectionThreeRow++)
  { 
  for(int drawSectionThreeColumn = 0; drawSectionThreeColumn < 30; drawSectionThreeColumn++)
  {
  drawSectionThreeX = 3 + 600 + drawSectionThreeRow * 300 / 30;
  drawSectionThreeY = 3 + 300 + drawSectionThreeColumn * 300 / 30;
  
  if(drawSectionThreeColumn % 2 == 0)
  {
    fill(255);
    noStroke();
    rect(drawSectionThreeX, drawSectionThreeY, 5, 5);
  } else {
    fill(0);
    noStroke();
    rect(drawSectionThreeX, drawSectionThreeY, 5, 5);
    }
    }
    }
  }

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */
  public void draw_section4(){
  int drawSectionFourX = 0;
  int drawSectionFourY = 0;
  for(int drawSectionFourRow = 0; drawSectionFourRow < 30; drawSectionFourRow++)
  { 
  for(int drawSectionFourColumn = 0; drawSectionFourColumn < 30; drawSectionFourColumn++)
  {
  drawSectionFourX = 3 + 900 + drawSectionFourRow * 300 / 30;
  drawSectionFourY = 3 + 300 + drawSectionFourColumn * 300 / 30;
  
  if(drawSectionFourColumn % 2 <= 0 && drawSectionFourRow % 2 == 0)
  {
    fill(255);
    noStroke();
    rect(drawSectionFourX, drawSectionFourY, 5, 5);
  } else {
    fill(0);
    noStroke();
    rect(drawSectionFourX, drawSectionFourY, 5, 5);
    }
    }
    }
    
  }

  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */
  public void draw_section5(){
  int drawSectionFiveX = 0;
  int drawSectionFiveY = 0;
  int drawSectionFiveRows = 0;
  int drawSectionFiveColumns = 0;

  for(int drawSectionFiveColumn = 30; drawSectionFiveColumn > drawSectionFiveColumns; drawSectionFiveColumn--)
    {
  for(int drawSectionFiveRow = 30; drawSectionFiveRow > drawSectionFiveRows; drawSectionFiveRow--)
    {
      drawSectionFiveX = 3 - 10 + drawSectionFiveRow * 300 / 30;
      drawSectionFiveY = 3 + drawSectionFiveColumn * 300 / 30;

      fill(255);
      noStroke();
      rect(drawSectionFiveX, drawSectionFiveY, 5, 5);
    }
    drawSectionFiveRows += 1;
    }
    
  }

  public void draw_section6(){
  int drawSectionSixX = 0;
  int drawSectionSixY = 0;
  int drawSectionSixRows = 30;
  int drawSectionSixColumns = 0;

  for(int drawSectionSixColumn = 30; drawSectionSixColumn > drawSectionSixColumns; drawSectionSixColumn--)
    {
    for(int drawSectionSixRow = 0; drawSectionSixRow < drawSectionSixRows; drawSectionSixRow++)
      {
        drawSectionSixX = 3 + 300 + drawSectionSixRow * 300 / 30;
        drawSectionSixY = 3 - 10 + drawSectionSixColumn * 300 / 30;
        fill(255);
        noStroke();
        rect(drawSectionSixX, drawSectionSixY, 5, 5);
      }
      drawSectionSixRows -= 1;
    }
  }

  public void draw_section7(){
  int drawSectionSevenX = 0;
  int drawSectionSevenY = 0;
  int drawSectionSevenRows = 30;
  int drawSectionSevenColumns = 30;

  for(int drawSectionSevenColumn = 0; drawSectionSevenColumn < drawSectionSevenColumns; drawSectionSevenColumn++)
    {
    for(int drawSectionSevenRow = 0; drawSectionSevenRow < drawSectionSevenRows; drawSectionSevenRow++)
      {
        drawSectionSevenX = 3 + 600 + drawSectionSevenRow * 300 / 30;
        drawSectionSevenY = 3 + drawSectionSevenColumn * 300 / 30;
        fill(255);
        noStroke();
        rect(drawSectionSevenX, drawSectionSevenY, 5, 5);
      }
      drawSectionSevenRows -= 1;
    }
  }
  
  public void draw_section8(){
  int drawSectionEightX = 0;
  int drawSectionEightY = 0;
  int drawSectionEightRows = 0;
  int drawSectionEightColumns = 30;

  for(int drawSectionEightColumn = 0; drawSectionEightColumn < drawSectionEightColumns; drawSectionEightColumn++)
    {
    for(int drawSectionEightRow = 30; drawSectionEightRow > drawSectionEightRows; drawSectionEightRow--)
      {
        drawSectionEightX = 3 - 10 + 900 + drawSectionEightRow * 300 / 30;
        drawSectionEightY = 3 + drawSectionEightColumn * 300 / 30;
        fill(255);
        noStroke();
        rect(drawSectionEightX, drawSectionEightY, 5, 5);
      }
      drawSectionEightRows += 1;
    }
  }

}

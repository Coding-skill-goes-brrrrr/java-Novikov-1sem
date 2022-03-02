package ru.spbu.arts.java.oop.ascigraphics;

public class Drawing {
       char [][] Draw;
       public Drawing (int x, int y, char unit){
           char [][] risunok = new char[y][x];
            for (int i = 0; i<y; i++)
                for (int j = 0; j<x; j++)
                    risunok[i][j] = unit;
            this.Draw = risunok;
        }

      public void print(){
           for (int i = 0; i<this.Draw.length; i++){
               String stroka = "";
               for (int j = 0; j<this.Draw[i].length; j++)
                   stroka += this.Draw[i][j];
               System.out.println(stroka);
          }
        }

     public void setPoint (int x, int y, char unit) {
           this.Draw[this.Draw.length-1][x-1] = unit;
     }

    public void drawVerticalLine (int x, int y1, int y2, char unit) {
        for (int i = this.Draw.length-y2; i<this.Draw.length-y1+1; i++) {
            this.Draw[i][x-1] = unit;
        }
    }

    public void drawHorizontalLine (int y, int x1, int x2, char unit) {
        for (int i = x1-1; i<x2; i++) {
            this.Draw[this.Draw.length-y][i] = unit;
        }
    }

    public void drawRectangle (int x1, int y1, int x2, int y2, char unit) {
        int x_1; int x_2; int y_1; int y_2;
        if (((x1>x2)&(y1>y2))|((x1<x2)&(y1<y2))){
        if (x1<x2){x_1 = x1;x_2 = x2; y_1 = y1; y_2 = y2;}
        else {x_1 = x2;x_2 = x1; y_1 = y2; y_2 = y1;}
        this.drawHorizontalLine(y_1, x_1, x_2, unit);
        this.drawHorizontalLine(y_2, x_1, x_2, unit);
        this.drawVerticalLine(x_1, y_1, y_2, unit);
        this.drawVerticalLine(x_2, y_1, y_2, unit);}
        else if (((x1<x2)&(y1>y2))|((x1>x2)&(y1<y2))){
            if (x1<x2){x_1 = x1;x_2 = x2; y_1 = y2; y_2 = y1;}
            else {x_1 = x2;x_2 = x1; y_1 = y1; y_2 = y2;}
            this.drawHorizontalLine(y_2, x_1, x_2, unit);
            this.drawHorizontalLine(y_1, x_1, x_2, unit);
            this.drawVerticalLine(x_2, y_1, y_2, unit);
            this.drawVerticalLine(x_1, y_1, y_2, unit);
        }
    }


}

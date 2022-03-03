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
           this.Draw[this.Draw.length-y][x-1] = unit;
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

    public void drawCircle (int x1, int y1, int r, char unit) {
        int x = 0;
        int y = r;
        int delta = 1 - 2 * r;
        int error = 0;
        while (y >= x){
        this.setPoint(x1 + x, y1 + y, unit);
        this.setPoint(x1 + x, y1 - y, unit);
        this.setPoint(x1 - x, y1 + y, unit);
        this.setPoint(x1 - x, y1 - y, unit);
        this.setPoint(x1 + y, y1 + x, unit);
        this.setPoint(x1 + y, y1 - x, unit);
        this.setPoint(x1 - y, y1 + x, unit);
        this.setPoint(x1 - y, y1 - x, unit);
        error = 2 * (delta + y) - 1;
        if ((delta < 0) & (error <= 0)){
            delta += 2 * ++x + 1;
            continue;}
        if ((delta > 0) & (error > 0)){
            delta -= 2 * --y + 1;
            continue;}
        delta += 2 * (++x - --y);
        }
    }

    public void drawLine(int x0, int y0, int x1, int y1, char unit){
        int deltax = Math.abs(x1 - x0);
        int deltay = Math.abs(y1 - y0);
        int error = 0;
        int deltaerr = (deltay + 1);
        int y = y0;
        int diry = y1 - y0;
        if (diry > 0)
            diry = 1;
        if (diry < 0)
            diry = -1;
        for (int x = x0; x <= x1; x++){
            this.setPoint(x, y, unit);
            error = error + deltaerr;
            if (error >= (deltax + 1)){
                y = y + diry;
                error = error - (deltax + 1);}
        }
    }

    public void toSummonGigaMonaLisaJokeJokondaYeeeee (){
        Drawing deBigPaintingNotByMe = new Drawing(35, 17, ' ');
        deBigPaintingNotByMe.drawHorizontalLine(1, 11, 13, '\'');
        deBigPaintingNotByMe.drawHorizontalLine(1, 14, 15, ':');
        deBigPaintingNotByMe.drawHorizontalLine(1, 16, 18, '=');
        deBigPaintingNotByMe.drawHorizontalLine(1, 19, 20, '.');
        deBigPaintingNotByMe.setPoint(21,1,'-');
        deBigPaintingNotByMe.setPoint(22,1,'\'');
        deBigPaintingNotByMe.setPoint(26,1,'=');
        deBigPaintingNotByMe.drawHorizontalLine(1, 29, 30, '-');
        deBigPaintingNotByMe.setPoint(31,1,'.');
        deBigPaintingNotByMe.setPoint(34,1,'`');

        deBigPaintingNotByMe.setPoint(7,2,'/');
        deBigPaintingNotByMe.drawHorizontalLine(2, 8, 9, '8');
        deBigPaintingNotByMe.setPoint(10,2,':');
        deBigPaintingNotByMe.setPoint(11,2,'.');
        deBigPaintingNotByMe.drawHorizontalLine(2, 12, 13, '_');
        deBigPaintingNotByMe.setPoint(15,2,',');
        deBigPaintingNotByMe.setPoint(23,2,'_');
        deBigPaintingNotByMe.setPoint(24,2,'%');
        deBigPaintingNotByMe.setPoint(25,2,'-');
        deBigPaintingNotByMe.setPoint(26,2,'\'');
        deBigPaintingNotByMe.drawHorizontalLine(2, 28, 30, '-');
        deBigPaintingNotByMe.setPoint(33,2,'-');

        deBigPaintingNotByMe.drawHorizontalLine(3, 9, 10, '8');
        deBigPaintingNotByMe.setPoint(11,3,'%');
        deBigPaintingNotByMe.drawHorizontalLine(3, 24, 26, '%');
        deBigPaintingNotByMe.drawHorizontalLine(3, 28, 31, '-');
        deBigPaintingNotByMe.setPoint(30,3,'\'');
        deBigPaintingNotByMe.setPoint(32,3,'.');

        deBigPaintingNotByMe.drawHorizontalLine(13, 6, 21, '"');
        deBigPaintingNotByMe.drawHorizontalLine(13, 22, 25, '8');

        deBigPaintingNotByMe.drawHorizontalLine(14, 5, 24, '_');
        deBigPaintingNotByMe.setPoint(12,14,'|');
        deBigPaintingNotByMe.setPoint(25,14,'|');

        deBigPaintingNotByMe.setPoint(12,15,'.');
        deBigPaintingNotByMe.setPoint(13,15,'\'');
        deBigPaintingNotByMe.setPoint(15,15,'/');
        deBigPaintingNotByMe.setPoint(18,15,'\\');
        deBigPaintingNotByMe.setPoint(24,15,'`');
        deBigPaintingNotByMe.setPoint(25,15,'.');

        deBigPaintingNotByMe.setPoint(14,16,'/');
        deBigPaintingNotByMe.setPoint(23,16,'\\');

        deBigPaintingNotByMe.setPoint(15,17,'.');
        deBigPaintingNotByMe.drawHorizontalLine(17, 16, 21, '-');
        deBigPaintingNotByMe.setPoint(22,17,'.');

        deBigPaintingNotByMe.drawVerticalLine(10, 7, 10, '8');
        deBigPaintingNotByMe.drawVerticalLine(11, 4, 13, '8');
        deBigPaintingNotByMe.drawVerticalLine(12, 4, 8, '8');
        deBigPaintingNotByMe.drawVerticalLine(13, 5, 7, '8');
        deBigPaintingNotByMe.drawVerticalLine(14, 6, 7, '8');
        deBigPaintingNotByMe.drawVerticalLine(22, 8, 10, '8');
        deBigPaintingNotByMe.drawVerticalLine(23, 6, 13, '8');
        deBigPaintingNotByMe.drawVerticalLine(24, 5, 13, '8');
        deBigPaintingNotByMe.drawVerticalLine(25, 5, 13, '8');
        deBigPaintingNotByMe.drawVerticalLine(26, 4, 11, '8');
        deBigPaintingNotByMe.drawVerticalLine(27, 3, 5, '8');

        deBigPaintingNotByMe.setPoint(8,3,'d');
        deBigPaintingNotByMe.setPoint(9,4,'d');
        deBigPaintingNotByMe.setPoint(10,12,'d');
        deBigPaintingNotByMe.setPoint(22,11,'d');
        deBigPaintingNotByMe.setPoint(27,6,'b');
        deBigPaintingNotByMe.setPoint(28,5,'b');
        deBigPaintingNotByMe.setPoint(29,4,'b');
        deBigPaintingNotByMe.setPoint(26,12,'b');
        deBigPaintingNotByMe.setPoint(12,9,'b');
        deBigPaintingNotByMe.setPoint(13,8,'b');
        deBigPaintingNotByMe.setPoint(10,4,'8');
        deBigPaintingNotByMe.setPoint(28,4,'8');
        deBigPaintingNotByMe.setPoint(10,5,'8');
        deBigPaintingNotByMe.setPoint(15,6,'8');
        deBigPaintingNotByMe.setPoint(10,11,'>');
        deBigPaintingNotByMe.setPoint(24,4,',');
        deBigPaintingNotByMe.setPoint(25,4,'%');
        deBigPaintingNotByMe.setPoint(10,6,'`');

        deBigPaintingNotByMe.drawHorizontalLine(5, 14, 15, '^');
        deBigPaintingNotByMe.setPoint(16,5,'\'');
        deBigPaintingNotByMe.setPoint(16,6,'|');
        deBigPaintingNotByMe.drawHorizontalLine(6, 18, 20, ':');
        deBigPaintingNotByMe.setPoint(21,6,'\'');
        deBigPaintingNotByMe.setPoint(15,7,'o');
        deBigPaintingNotByMe.drawHorizontalLine(7, 16, 17, '-');
        deBigPaintingNotByMe.drawHorizontalLine(7, 18, 22, ':');
        deBigPaintingNotByMe.setPoint(19,7,'\'');
        deBigPaintingNotByMe.drawHorizontalLine(8, 15, 18, '~');
        deBigPaintingNotByMe.drawHorizontalLine(8, 16, 17, '=');
        deBigPaintingNotByMe.setPoint(20,8,'.');
        deBigPaintingNotByMe.setPoint(21,8,':');
        deBigPaintingNotByMe.setPoint(13,9,'.');
        deBigPaintingNotByMe.setPoint(15,9,'`');
        deBigPaintingNotByMe.setPoint(16,9,'-');
        deBigPaintingNotByMe.setPoint(17,9,'~');
        deBigPaintingNotByMe.setPoint(20,9,'\'');
        deBigPaintingNotByMe.setPoint(21,9,':');
        deBigPaintingNotByMe.setPoint(21,10,',');
        deBigPaintingNotByMe.drawHorizontalLine(11, 13, 15, '`');
        deBigPaintingNotByMe.setPoint(14,11,'~');
        deBigPaintingNotByMe.setPoint(17,11,':');
        deBigPaintingNotByMe.setPoint(18,11,'`');
        deBigPaintingNotByMe.setPoint(19,11,'~');
        deBigPaintingNotByMe.setPoint(20,11,'\'');
        deBigPaintingNotByMe.drawHorizontalLine(12, 12, 15, '.');
        deBigPaintingNotByMe.setPoint(13,12,'-');
        deBigPaintingNotByMe.setPoint(14,12,'=');
        deBigPaintingNotByMe.setPoint(17,12,',');
        deBigPaintingNotByMe.drawHorizontalLine(12, 18, 19, '=');
        deBigPaintingNotByMe.setPoint(20,12,'-');
        deBigPaintingNotByMe.setPoint(21,12,'.');
        deBigPaintingNotByMe.setPoint(22,12,':');
        deBigPaintingNotByMe.setPoint(30,4,'.');
        deBigPaintingNotByMe.print();
    }


}

package ru.spbu.arts.java.oop.time;

public class Time {
int hrs;
int mins;

public Time (int hrs, int mins){
this.hrs = hrs;
this.mins = mins;
}

public String show() {
    if ((this.hrs < 10)&(this.mins < 10)){return '0' + Integer.toString(this.hrs) + ':' + '0' + Integer.toString(this.mins);}
    else if ((this.hrs < 10)&(this.mins > 9)){return '0' +Integer.toString(this.hrs) + ':' + Integer.toString(this.mins);}
    else if ((this.hrs > 9)&(this.mins < 10)){return Integer.toString(this.hrs) + ':' + '0' + Integer.toString(this.mins);}
    else {return Integer.toString(this.hrs) + ':' + Integer.toString(this.mins);}
    }

public Boolean IsMorning() {
    if ((hrs > 4)&(hrs < 11)){return true;}
    else return false;
    }

public Boolean IsDay() {
    if ((hrs > 10)&(hrs < 17)){return true;}
    else return false;
    }

public Boolean IsEvening() {
    if ((hrs > 16)&(hrs < 23)){return true;}
    else return false;
    }

public Boolean IsNight() {
    if ((hrs > 22)|(hrs < 5)){return true;}
    else return false;
    }

public String sayHello() {
        if (IsMorning()){return "Доброе утро!";}
        else if (IsDay()){return "Добрый день!";}
        else if (IsEvening()){return "Добрый вечер!";}
        else {return "Доброй ночи!";}
    }

public void add(int more_mins) {
    int h = this.hrs;
    int m = this.mins;
h += more_mins/60;
m += more_mins%60;
if (m > 59){h += 1;}
this.hrs = h % 24;
this.mins = m % 60;
    }

}

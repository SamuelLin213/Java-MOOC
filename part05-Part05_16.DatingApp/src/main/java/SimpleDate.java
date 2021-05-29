
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    public void advance() {
        this.day += 1;
        if(this.day > 30){
            this.day = 1;
            this.month += 1;
        }
        if(this.month > 12){
            this.month = 1;
            this.year += 1;
        }
    }
    public void advance(int howManyDays){
        for(int i = 0; i < howManyDays; i++) {
            this.advance();
        }
    }
    public SimpleDate afterNumberOfDays(int days) {
        int nDays = this.day + days;
        int nMonth = this.month;
        int nYear = this.year;
        while(nDays > 30){
            nDays -= 30;
            nMonth += 1;
            if(nMonth > 12){
                nYear += 1;
                nMonth = 1;
            }
        }
        SimpleDate newDate = new SimpleDate(nDays, nMonth, nYear);
        
        return newDate;
    }
}

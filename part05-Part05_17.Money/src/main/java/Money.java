
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    public Money plus(Money addition) {
        int nCents = this.cents() + addition.cents();
        int nEuros = this.euros() + addition.euros();
        
        Money newMoney = new Money(nEuros, nCents);
        return newMoney;
    }
    public boolean lessThan(Money compared) {
        if(this.euros() < compared.euros()){
            return true;
        } else if(this.euros() == compared.euros() && this.cents() < compared.cents()){
            return true;
        }
        return false;
    }
    public Money minus(Money decreaser) {
        int nCents = this.cents() - decreaser.cents();
        int nEuros = this.euros - decreaser.euros();
        
        if(nCents < 0) {
            nCents += 100;
            nEuros -= 1;
        }
        if(nCents < 0 || nEuros < 0) {
            nCents = 0;
            nEuros = 0;
        }
        
        Money nMoney = new Money(nEuros, nCents);
        return nMoney;
    }
}

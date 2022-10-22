public class feesManagement {
    private int hourlyRate;
    
    feesManagement(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double culculateFees(long Duaration) {
        
        return Duaration * this.hourlyRate;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    
}

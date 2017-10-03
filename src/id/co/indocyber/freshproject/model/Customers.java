/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.freshproject.model;

/**
 *
 * @author user
 */
public class Customers {

    private String name;
    private String gender;
    private String married;
    private int age;
    private int depent;
    private double salary;
    private double bonus;
    private double hargaBarang;
    private double dP;
    private int time;
    private double rate;
    private String telp;
    private String adress;
    private String idCustomers;

    public Customers() {
    }

    public Customers(String name, String gender, String married, int age, int depent, double salary, double bonus, double hargaBarang, double dP, int time, double rate, String telp, String adress, String idCustomers) {
        this.name = name;
        this.gender = gender;
        this.married = married;
        this.age = age;
        this.depent = depent;
        this.salary = salary;
        this.bonus = bonus;
        this.hargaBarang = hargaBarang;
        this.dP = dP;
        this.time = time;
        this.rate = rate;
        this.telp = telp;
        this.adress = adress;
        this.idCustomers = idCustomers;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the married
     */
    public String getMarried() {
        return married;
    }

    /**
     * @param married the married to set
     */
    public void setMarried(String married) {
        this.married = married;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the depent
     */
    public int getDepent() {
        return depent;
    }

    /**
     * @param depent the depent to set
     */
    public void setDepent(int depent) {
        this.depent = depent;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    /**
     * @return the hargaBarang
     */
    public double getHargaBarang() {
        return hargaBarang;
    }

    /**
     * @param hargaBarang the hargaBarang to set
     */
    public void setHargaBarang(double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    /**
     * @return the dP
     */
    public double getdP() {
        return dP;
    }

    /**
     * @param dP the dP to set
     */
    public void setdP(double dP) {
        this.dP = dP;
    }

    /**
     * @return the time
     */
    public int getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(int time) {
        this.time = time;
    }

    /**
     * @return the rate
     */
    public double getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(double rate) {
        this.rate = rate;
    }

    public double PokokCicilan() {
        double pokokCicilan = hargaBarang - dP;
        return pokokCicilan;
    }

    public double BungaCicilan() {
        double bungaCicilan = (PokokCicilan() * rate * (time / 12.0));
        return bungaCicilan;
    }

    private double TotalKredit() {
        double totalKredit = PokokCicilan() + BungaCicilan();
        return totalKredit;
    }

    public double CicilanPerBulan() {
        double cicilanPerBulan = TotalKredit() / time;
        return cicilanPerBulan;
    }

    public double TotalPenghasilan() {
        double totalPenghasilan = salary + bonus;
        return totalPenghasilan;
    }

    public double LimitPinjaman() {
        double limitPinjaman = (TotalPenghasilan() / (depent + 1));
        return limitPinjaman;
    }

    public String AnalisaKredit() {
        String hasilKredit = " ";
        if (LimitPinjaman() > CicilanPerBulan()) {
            hasilKredit = ("Your credit is approved");
        } else {
            hasilKredit = ("Your credit is not approved");
        }
        return hasilKredit;
    }

    /**
     * @return the telp
     */
    public String getTelp() {
        return telp;
    }

    /**
     * @param telp the telp to set
     */
    public void setTelp(String telp) {
        this.telp = telp;
    }

    /**
     * @return the adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @param adress the adress to set
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     * @return the idCustomers
     */
    public String getIdCustomers() {
        return idCustomers;
    }

    /**
     * @param idCustomers the idCustomers to set
     */
    public void setIdCustomers(String idCustomers) {
        this.idCustomers = idCustomers;
    }

}

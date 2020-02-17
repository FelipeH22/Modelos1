package lógica;

public class Calculadora extends dataAbstract implements getInterface, setInterface, operacionesInterface {
    
    @Override
    public char getSigno(){
        return signo;
    }
    
    @Override
    public void setSigno(char signo){
        this.signo = signo;
    }

    @Override
    public int getNum1() {
        return num1;
    }

    @Override
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    @Override
    public int getNum2() {
        return num2;
    }

    @Override
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    @Override
    public int suma(int num1, int num2){
        return num1+num2;
    }
    @Override
    public int resta(int num1,int num2){
        return num1-num2;
    }
    
    @Override
    public int producto(int num1, int num2){
        return num1*num2;
    }
    @Override
    public int cociente(int num1, int num2){
        return num1/num2;
    }
}

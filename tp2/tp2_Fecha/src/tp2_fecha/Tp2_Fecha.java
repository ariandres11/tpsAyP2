package tp2_fecha;

import java.util.Scanner;

public class Tp2_Fecha {

    public static void main(String[] args) {
        boolean esBisiesto;
        Fecha fecha1 = new Fecha();
        Fecha fechaRes = new Fecha();

        Scanner teclado = new Scanner(System.in);

        //teclado.nextLine();
        System.out.println("Ingresa la fecha con el formato dd/mm/aaaa");
        String[] numeros = teclado.nextLine().split("/");
        fecha1.setDia(Integer.parseInt(numeros[0]));
        fecha1.setMes(Integer.parseInt(numeros[1]));
        fecha1.setAño(Integer.parseInt(numeros[2]));
        System.out.println(fecha1);

        System.out.println("¿El año es bisiesto? 1. Si 2. No");
        int bisiesto1 = teclado.nextInt();
        esBisiesto = (bisiesto1 == 1);

        System.out.println("Ingresa el numero de operacion que desea realizar:");
        System.out.println("1. Adelantar un dia");
        System.out.println("2. Adelantar un mes");
        System.out.println("3. Adelantar un año");

        int numOpe = teclado.nextInt();

        switch (numOpe) {
            case 1:
                System.out.println("Es un año bisiesto? 1. Si 2. No");

                fechaRes = diaSiguiente(fecha1, esBisiesto);
                System.out.println("Fecha final: " + fechaRes);
                System.out.println("Programa finalizado");
                break;
            case 2:
                fechaRes = mesSiguiente(fecha1);
                System.out.println("Fecha final: " + fechaRes);
                System.out.println("Programa finalizado");
                break;
            case 3:
                fechaRes = añoSiguiente(fecha1);
                System.out.println("Fecha final: " + fechaRes);
                System.out.println("Programa finalizado");
                break;
            case 4:
                System.out.println("Es un año bisiesto? 1. Si 2. No");
                fechaRes = diaAnterior(fecha1, esBisiesto);
                System.out.println("Fecha final: " + fechaRes);
                System.out.println("Programa finalizado");
            default:
                System.out.println("Número de operacion invalido");
                System.out.println("Programa finalizado");
        }

    }

    public static Fecha diaSiguiente(Fecha fecha, boolean esBisiesto) {
        int año = fecha.getAño();
        int mes = fecha.getMes();
        int dia = fecha.getDia();
        if (dia >= 28) {
            //Verifico que mes es
            if (mes == 02 && !esBisiesto) {
                //Cambiar de febrero a marzo
                mes++;
                dia = 1;
                return new Fecha(año, mes, dia);
            } else {
                if (mes == 6 || mes == 4 || mes == 9 || mes == 11) {
                    if (dia + 1 > 30) {
                        mes++;
                        dia = 1;
                        return new Fecha(año, mes, dia);
                    } else {
                        dia++;
                        return new Fecha(año, mes, dia);
                    }
                } else {
                    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                        if (dia + 1 > 31) {
                            if (mes == 12) {
                                año++;
                                mes = 1;
                                dia = 1;
                                return new Fecha(año, mes, dia);
                            } else {
                                mes++;
                                dia = 1;
                                return new Fecha(año, mes, dia);
                            }
                        } else {
                            dia++;
                            return new Fecha(año, mes, dia);
                        }
                    }
                }
            }
        } else {
            dia++;
        }
        return new Fecha(0, 0, 0);
    }

    public static Fecha diaAnterior(Fecha fecha, boolean esBisiesto) {
        int año = fecha.getAño();
        int mes = fecha.getMes();
        int dia = fecha.getDia();

        if (dia != 1) {
            dia--;
            return new Fecha(año, mes, dia);
        } else {
            if (dia == 1 && (mes == 11 || mes == 9 || mes == 8 || mes == 6 || mes == 2)) {
                dia = 31;
                mes = 1;
                return new Fecha(año, mes, dia);
            } else {
                if (dia == 1 && mes == 1) {
                    año--;
                    mes = 12;
                    dia = 31;
                    return new Fecha(año, mes, dia);
                } else {
                    if ((dia == 1 && mes == 3) && !esBisiesto) {
                        //Febrero
                        dia = 28;
                        mes = 2;
                    } else {
                        if ((dia == 1 && mes == 3) && esBisiesto) {
                            dia = 29;
                            mes = 2;
                        } else {
                            mes--;
                            dia = 30;
                        }
                    }
                    return new Fecha(año, mes, dia);
                }
            }
        }
    }

    public static Fecha mesSiguiente(Fecha fecha) {
        int año = fecha.getAño();
        int mes = fecha.getMes();
        int dia = fecha.getDia();

        if (mes != 12) {
            mes++;
            return new Fecha(año, mes, dia);
        } else {
            año++;
            mes = 1;
            return new Fecha(año, mes, dia);
        }
    }

    public static Fecha añoSiguiente(Fecha fecha) {
        int año = fecha.getAño();
        int mes = fecha.getMes();
        int dia = fecha.getDia();
        año++;
        return new Fecha(año, mes, dia);
    }

    public static Fecha devuelveMayor(Fecha fecha1, Fecha fecha2, boolean esBisiesto) {
        int añof1 = fecha1.getAño();
        int añof2 = fecha2.getAño();

        int mesf1 = fecha1.getMes();
        int mesf2 = fecha2.getMes();

        int diaf1 = fecha1.getDia();
        int diaf2 = fecha2.getDia();

        if (añof1 < añof2) {
            return fecha2;
        } else if (añof1 > añof2) {
            return fecha1;
        } else {
            if (mesf1 < mesf2) {
                return fecha2;
            } else if (mesf1 > mesf2) {
                return fecha1;
            } else {
                if (diaf1 < diaf2) {
                    return fecha2;
                } else if (diaf1 > diaf2) {
                    return fecha1;
                } else {
                    //Devuelvo cualquiera porque son la misma fecha 
                    return fecha1;
                }
            }
        }
    }

    public static boolean verIgualdad(Fecha fecha1, Fecha fecha2) {
        int añof1 = fecha1.getAño();
        int añof2 = fecha2.getAño();

        int mesf1 = fecha1.getMes();
        int mesf2 = fecha2.getMes();

        int diaf1 = fecha1.getDia();
        int diaf2 = fecha2.getDia();

        if (añof1 == añof2 && mesf1 == mesf2 && diaf1 == diaf2) {
            return true;
        }
        return false;
    }

    public static int calcularDiferencia(Fecha fecha1, Fecha fecha2) {

        int añof1 = fecha1.getAño();
        int añof2 = fecha2.getAño();

        int mesf1 = fecha1.getMes();
        int mesf2 = fecha2.getMes();

        int diaf1 = fecha1.getDia();
        int diaf2 = fecha2.getDia();
        
        int diaMay, diaMen, dif;
        
        if (añof1 == añof2 && mesf1 == mesf2 && diaf1 == diaf2) {
            //Es el mismo dia
            return 0;
        }else{
            if (añof1 == añof2 && mesf1 == mesf2 && diaf1 !=diaf2) {
                if (diaf1 < diaf2) {
                    //Dia de la fecha 2 es mayor
                    diaMay = diaf2;
                    diaMen = diaf1;
                }else{
                    diaMay = diaf1;
                    diaMen = diaf2;
                }
                dif = diaMay - diaMen;
                return dif;
            }else{
                if (añof1 == añof2 && mesf1 != mesf2) {
                    
                }
            }
        }

        return 0;
    }
}

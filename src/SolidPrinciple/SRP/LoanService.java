package SolidPrinciple.SRP;

public class LoanService {

    public void getLoanServiceInfo(String loanTyp){

        if(loanTyp.equals("homeLoan")){
            System.out.println("These are the details about home loan");
        }
        if(loanTyp.equals("personalLoan")){
            System.out.println("These are the details about personal loan");
        }
    }


}

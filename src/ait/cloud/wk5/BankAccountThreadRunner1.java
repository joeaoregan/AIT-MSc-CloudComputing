/**
   This program runs threads that deposit and withdraw
   money from the same bank account. 
*/
package ait.cloud.wk5;

public class BankAccountThreadRunner1
{
   public static void main(String[] args)
   {
      BankAccount1 account = new BankAccount1();
      final double AMOUNT = 100;
      final int REPETITIONS = 100;
      final int THREADS = 100;

      for (int i = 1; i <= THREADS; i++)
      {
         DepositRunnable1 d = new DepositRunnable1(
            account, AMOUNT, REPETITIONS);
         WithdrawRunnable1 w = new WithdrawRunnable1(
            account, AMOUNT, REPETITIONS);
         
         Thread dt = new Thread(d);
         Thread wt = new Thread(w);
         
         dt.start();
         wt.start();
      }
   }
}
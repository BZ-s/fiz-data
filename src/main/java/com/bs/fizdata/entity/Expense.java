package com.bs.fizdata.entity;

/**
 * Reprensent an expense made by an employee tthat will be reimboursed
 */
public class Expense extends Document{



   public String label;
   public Number amount;
   public int taxRate;
   public ExpenseCategory expenseCategory;
   public Ticket ticket;

    public Expense(String id) {
        super(id);
    }
}

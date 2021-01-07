Project Name: Multi Currency Money
--
-- --
__Requirements:__
1. Given total number of shares, price at which each shares were bought (different currencies), find the total amount in the Portfolio
2. All currencies must be converted to US Dollar
    * Based on Exchange Rate
-- --     
__Technical Requirements For Report__
1. Need to able to ADD amounts in 2 different currencies and convert result given a set of exchange rate
2. Need to be able to MULTIPLY an amount by a number (number of shares) and recevie an amount

-- --
__Setup TDD To-Do List__
1. Program should able to add 2 currencies (provided exchange rate)
    * Example: $5 + 10 CHF = $10 (Exchange rate of 2:1)
    
2. Make "amount" private
3. Concerns:
   * Dollar side effects?
    * Money Rounding?
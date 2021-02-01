Project Name: Multi Currency Money
--
-- --
__Requirements:__
1. Given total number of shares, price at which each shares were bought (different currencies), find the total amount in the Portfolio
2. All currencies must be converted to US Dollar
    * Based on Exchange Rate

Multi-Currency Money:

|Stock|Shares|Price|Total|
|-----|------|-----|-----|
|IBM|  1000  | 25 - USD | 25,000 USD
|GE  |400    | 150 - NRS | 40,000 - NRS
|     |       |  Total | 65,000 - USD
-- --     
__Technical Requirements For Report --> What Operations?__ 
1. Need to able to __ADD__ amounts in 2 different currencies and convert result given a set of exchange rate
2. Need to be able to __MULTIPLY__ an amount by a number (number of shares) and recevie an amount

-- --
__Setup TDD: Make a To-Do List__

How would you categorize the list?
1. List of Tests (test on business logic)
   * Consider Edge cases
   * Consider Requirements
   
2. Test you are CURRENTLY Working on
3. Completed tests 
4. Test pushed forward (On Hold)

Example:
1. Program should able to __add__ 2 currencies (provided exchange rate)
    * Example: $5 + 10 CHF = $10 (Exchange rate of 2:1)
    
2. Make "amount" private
3. Concerns:
   * Dollar side effects?
    * Money Rounding?
Texas Holdem Tips
=================

Simplified Post Flop Odds
-------------------------

Use this formula to calculate your odds on a drawing hand:

	Number of outs * 2 * number of cards left
	
Outs: The number of cards that improve the hand
	

###Examples

| Hand  | Board       | Outs  | Explanation              |  % |
|-------|-------------|-------|--------------------------|----|
| Kh Jh | Ah Jc 3h    | 9 + 2 | 9 Hearts + 2 Jacks       | 44 |
| Kh Jh | Ah Jc 3h 2s | 9 + 2 | 9 Hearts + 2 Jacks       | 22 |
| Kh Jh | QC Th 3h    | 9 + 6 | 9 Hearts + 3 Aces + 3 9s | 60 |
| Kh Jh | QC Th 3h 2s | 9 + 6 | 9 Hearts + 3 Aces + 3 9s | 30 |


Semi-bluff
----------

A Semi-bluff is betting or raising on a drawing hand.  For Example,
raising when you hold a four flush after the flop.  The goal is
to **increase your expected value by adding fold equity**.


| Var | Term           | Definition                  
|-----|----------------|-----------------------------
| P   | Pot            | amount currently in the pot 
| B   | Bet            | all in bet amount
| F   | Fold Equity    | % opponent folds 
| C   | (1 -F).        | % opponent calls
| W   | Pot Equity     | % winning
| L   | (1 -W)         | % losing
| V   | Expected Value | The average gain or loss


Expected value for all in bet:

    V = FP + CW(P + B ) – CLB
    

All in bet after flopping a strait or flush draw (15 outs, 
2 cards yet to come)

| Pot | Bet | Fold | Call | Win | Lose | Expected Value 
|-----|-----|------|------|-----|------|---------------
| 100 | 100 |  0.0 |  1.0 | 0.6 |  0.4 |  80.0
| 100 | 100 |  0.2 |  0.8 | 0.6 |  0.4 |  84.0
| 100 | 100 |  0.4 |  0.6 | 0.6 |  0.4 |  88.0
| 100 | 100 |  0.6 |  0.4 | 0.6 |  0.4 |  92.0
| 100 | 100 |  0.8 |  0.2 | 0.6 |  0.4 |  96.0
| 100 | 100 |  1.0 |  0.0 | 0.6 |  0.4 | 100.0

All in bet after turning a straight or flush draw (15 outs,
only 1 card yet to come)    
    
| Pot | Bet | Fold | Call | Win | Lose | Expected Value 
|-----|-----|------|------|-----|------|---------------
| 100 | 100 |  0.0 |  1.0 | 0.3 |  0.7 | -10.0
| 100 | 100 |  0.2 |  0.8 | 0.3 |  0.7 |  12.0
| 100 | 100 |  0.4 |  0.6 | 0.3 |  0.7 |  34.0
| 100 | 100 |  0.6 |  0.4 | 0.3 |  0.7 |  56.0
| 100 | 100 |  0.8 |  0.2 | 0.3 |  0.7 |  78.0
| 100 | 100 |  1.0 |  0.0 | 0.3 |  0.7 | 100.0


Conclusion
----------

Add semi-bluffs to you game and win more often!

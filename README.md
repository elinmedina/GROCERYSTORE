# GROCERYSTORE
A Java application through IntelliJ IDEA CE, that calculates purchase totals and exports formatted transaction receipts to a text file (receipt.txt).

---

## How to Run
1. Open the project in IDE
2. Answer the following questions:
   - What item will you be getting?
   - How much is it?
   - How many will you be getting?
3. Your data is now saved in a .txt file (receipt.txt)

**COMPILE THE CODE:**
   ```bash
   javac Main.java

## WHAT IT DOES
- Asks user for item name, price, and quantity
- Automatically calculates the total cost
- Exports a formatted `receipt.txt` file
- Uses Java's `try-with-resources` for safe file handling

---

### EXAMPLE INTERACTION
WHAT ITEM ARE YOU GETTING?: Espresso Beans
HOW MUCH IS IT?: 18.50
HOW MANY WILL YOU BE PURCHASING?: 2

--- RECEIPT SAVED TO receipt.txt ---

### EXAMPLE OUTPUT
ITEM: Coffee
PRICE: $4.50
QUANTITY: 2
TOTAL: $9.00

---

#### COLLABORATION ACKNOWLEDGEMENT
This project was reviewed and edited by TheBoople on GitHub.

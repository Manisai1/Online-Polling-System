# 🗳️ Online Polling System with Real-Time Analytics

## 📌 Project Overview

The **Online Polling System** is a Java-based, menu-driven application designed to conduct real-time voting with transparency, fairness, and analytical insights. It simulates real-world polling scenarios such as student elections, competitions, and feedback systems using core **Data Structures and Algorithms (DSA)**.

---

## 🚀 Problem Statement

Traditional polling systems suffer from:

* ❌ Manual errors and lack of structure
* ❌ Delayed result processing
* ❌ No analytical insights
* ❌ Duplicate or unfair voting
* ❌ No undo/rollback mechanism
* ❌ Poor user engagement

This project solves these issues using efficient **DSA-based design**.

---

## 💡 Key Features

### 👥 Candidate & Voter Management

* Add/remove candidates (Name + ID)
* Add/remove voters (Name + ID)
* Display all candidates and voters

### 🗳️ Voting System

* Accept votes (Voter ID, Candidate ID)
* Prevent duplicate voting
* Real-time validation and feedback

### 📊 Real-Time Leaderboard

* Live vote counting
* Sorted ranking of candidates
* Tie handling

### ⏱️ Recent Activity Tracking

* Track last 5 voted candidates using Stack
* Display latest votes first

### 🔄 Vote Processing (FIFO)

* Queue-based vote processing
* Maintain order of incoming votes
* Log processed votes

### 🔍 Fast Lookup

* HashMap for quick vote counting
* Efficient search and update operations

### 🌳 Binary Search Tree (BST)

* Store candidates in BST
* Search by Candidate ID
* Inorder traversal (sorted output)

### ↩️ Undo Functionality

* Undo last vote using Stack
* Maintain voting history

---

## 🧠 Data Structures Used

| Feature                | Data Structure     |
| ---------------------- | ------------------ |
| Candidate/Voter List   | LinkedList         |
| Vote Processing        | Queue              |
| Undo Operations        | Stack              |
| Duplicate Detection    | HashSet            |
| Fast Lookup            | HashMap            |
| Candidate Organization | Binary Search Tree |
| Sorting & Searching    | Algorithms         |

---

## 🛠️ Technologies Used

* Language: **Java**
* Concepts: **DSA, OOP, Searching, Sorting**

---

## 📥 Inputs

* Candidate Name & ID
* Voter Name & ID
* Vote (Voter ID, Candidate ID)
* Menu-driven user commands

---

## 📤 Outputs

* Vote status (Accepted / Rejected)
* Leaderboard rankings
* Recent votes (Stack view)
* Vote logs (Queue order)
* Candidate/Voter lists
* Search results

---

## 🧪 Sample Data

### Candidates

* Asha Mehra (C101)
* Rohan Verma (C102)
* Nisha Rao (C103)
* Arjun Khanna (C104)

### Voters

* Priya Singh (V201)
* Karan Patel (V202)
* Meena Das (V203)
* Rahul Bose (V204)
* Tanya Roy (V205)

---

## 🎯 How This Project Solves Real Problems

| Problem          | Solution                         |
| ---------------- | -------------------------------- |
| Manual tracking  | LinkedList management            |
| Delayed results  | Queue-based real-time processing |
| Duplicate voting | HashSet validation               |
| No analytics     | Leaderboards + history tracking  |
| Unfair voting    | Controlled vote validation       |
| No rollback      | Stack-based undo                 |

---

## ⚙️ How to Run

1. Clone the repository:

```
git clone https://github.com/Manisai1/Online-Polling-System.git
```

2. Open in IntelliJ / any Java IDE

3. Run the main class:

```
Main.java
```

4. Follow menu instructions in console

---

## 🧩 Challenges Solved

* Ensuring vote integrity (no duplicates)
* Managing real-time updates
* Implementing undo functionality
* Choosing correct data structures
* Designing modular code

---

## 📈 Future Enhancements

* Login system (Admin/User roles)
* GUI-based dashboard
* Graphical analytics (charts)
* Export reports (CSV)
* Real-time alerts and notifications

---

## ✅ Success Criteria

* Accurate vote tracking
* Proper use of DSA concepts
* Clean and modular code
* Smooth execution without errors
* Meaningful analytics

---

## 👨‍💻 Author

**Manisai**

---

## ⭐ If you like this project

Give it a ⭐ on GitHub!

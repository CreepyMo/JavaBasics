
# Java Basics Homework Repository

Welcome to the Java Basics Homework repository! This repository contains the tasks for your Java learning journey. Follow the instructions below to clone, work on, and submit your homework.

## **Cloning the Repository Using SSH**

To get started, you'll need to clone this repository to your local machine using **SSH**. Follow these steps:

### **Step 1: Ensure You Have SSH Setup**

Make sure you have SSH setup on your local machine, and your SSH key is added to GitHub. If you haven't done this already, follow [GitHub's SSH setup guide](https://docs.github.com/en/github/authenticating-to-github/connecting-to-github-with-ssh).

### **Step 2: Clone the Repository**

1. Copy the SSH URL for the repository from GitHub. It should look like this:
   ```
   git@github.com:CreepyMo/JavaBasics.git
   ```

2. Open your terminal and run the following command to clone the repository:
   ```bash
   git clone git@github.com:CreepyMo/JavaBasics.git
   ```

3. Navigate into the repository folder:
   ```bash
   cd repository-name
   ```

---

## **How to Work on Homework**

Follow these steps to work on your homework tasks:

### **Step 1: Create a New Branch from `main`**
It's important to always work on a new branch for each homework task, so you don’t interfere with the main branch. To create a new branch:

1. Ensure you're on the `main` branch:
   ```bash
   git checkout main
   ```

2. Pull the latest changes from the remote `main` branch (to stay up-to-date):
   ```bash
   git pull origin main
   ```

3. Create a new branch for your task (replace `task-name` with the actual name of the task):
   ```bash
   git checkout -b task-name
   ```

   For example:
   ```bash
   git checkout -b homework-task1
   ```

### **Step 2: Work on Your Homework Task**
1. Open the relevant files in your code editor.
2. Implement the solution for the task assigned to you.
3. Test your solution to make sure it works correctly.

### **Step 3: Commit Your Solution**
Once you’ve completed your task, commit your changes to the branch.

1. Stage your changes:
   ```bash
   git add .
   ```

2. Commit your changes with a meaningful message:
   ```bash
   git commit -m "Completed task 1: Implemented solution"
   ```

### **Step 4: Push Your Solution**
Now that you have committed your solution, push your branch to GitHub:

```bash
git push origin task-name
```

For example:
```bash
git push origin homework-task1
```

### **Step 5: Create a Pull Request**
1. Go to the GitHub repository page.
2. You will see a prompt to **Create a Pull Request** for your recently pushed branch. Click on **Compare & pull request**.
3. Add a descriptive title and comment about your changes.
4. Select **main** as the base branch and your `task-name` branch as the compare branch.
5. Click **Create pull request** to submit your solution.

### **Step 6: Review and Merge (Instructor's Task)**
The instructor will review your pull request and merge it into the `main` branch once it's approved.

---

## **Additional Notes**
- Always create a new branch for each task and do not push directly to the `main` branch.
- Keep your commits small and descriptive.
- Follow the correct naming convention for the branches and commit messages.
- Don’t forget to pull the latest changes from `main` before you start your task to avoid merge conflicts.

---

That's it! Once you’ve created a pull request, you're done. Happy coding! 🎉

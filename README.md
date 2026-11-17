# CICD-1 Coding Test — Review, Improve and Reflect

**Student ID:G00463862**  
**Examination group:** A (Room Booking / JPQL)  
**Original examination pull-request URL (`https://github.com/jose2049/G00463862.git`):**  
**New review repository URL: https://github.com/jose2049/CICD_Review_Jose.git**  

## 1. My original examination self-assessment

Review the code **as submitted in the original examination**. Do not change the original repository, branch or pull 
request. Check your own Group A or Group B examination paper and award marks only for evidence present in the original 
submission.

### Task 1 — 16/40
**My mark: Some marks**
**Partly implemented; key behaviour missing**

**Evidence from the original code (files, methods, working or missing requirements):**
**So I have the model with the requirements asked, but I have no validation for each one**
**I hve the 2 DTIOs but for the output DTO I'm not retrieving the data that I am being asked for. The input DTO meets 
the requirements. Also, what I am returning to the user is all the info the user asked for**

### Task 2 — 4/40
**My mark: Limited marks**
**Relevant attempt without much working behavior**
**Evidence from the original code:** 
**The post and get annotations where created. Post was partly implemented because it doesn't meet the validation criteria.
Get was created, but it definitely doesn't work at all.**

### Task 3 — 0/20
**My mark: No marks**
**No relevant implementation**
**Evidence from the original code:**  

**Total self-assessed original examination mark: /100**

**Checkpoint:** Commit this completed self-assessment as the **first review commit in your new repository**, before you modify or add application code. The lecturer decides the official original examination mark.

## 2. Corrections and improvements in my new project

Start from a **fresh copy of the starter template for your own exam group**, in a **new GitHub repository**. You may consult or selectively reuse your own original examination code, but the new project must demonstrate that you understand and can correct it. Do not change your original examination submission.

Describe **two or three important problems** in your original code. For each, explain what was wrong, which class or method you changed in the new project, and why the corrected approach works.

**Problem and correction 1: Validation. I just didn't use the proper validations annotations for the requirements. **  

**Problem and correction 2: How to use the DTOs to receive and return the info I want. And the difference between using 
and object and a DTO. I didn't know that I had to use an instance of BookingService to access the methods of the service
layers on my Controller layer**  

**Problem and correction 3 (optional): How to access information. This was tricky because I don't really understand the 
code to access the info I want to. I may understand what I want to have access to but I'm just unable to write code by 
myself and access to the database and retrieve the data. **  

## 3. API testing and evidence

Use Swagger UI or another HTTP client. For **at least four meaningful checks**, record the request/input, expected result, actual HTTP status/response, and pass/fail. Include unsuccessful cases; a running application alone is not enough.

**Test 1 — successful booking request:**  
- Request / input:  
- Expected:  
- Actual HTTP status / body:  
- Pass  

**Test 2 — invalid input or excessive attendee count:**  
- Request / input:  
- Expected:  
- Actual HTTP status / body:  
- Partial pass. It does give an error, but it doesn't specify the type of error

**Test 3 — missing booking or room:**  
- Request / input:  
- Expected:  
- Actual HTTP status / body:  
- Pass It does give an error, but it doesn't specify the type of error

**Test 4 — requirement specific to my group:**  
- Request / input:  
- Expected:  
- Actual HTTP status / body:  
- Pass / fail:  

**Group A:** Demonstrate `GET /api/bookings/search?roomName=...` using an exact room name, bookings ordered by attendee count descending, and an empty list for no matches. Add checks if necessary to show all three behaviours.

## 4. Reflection

**What did I understand during the examination but struggle to implement?**
**I understood that I needed to make bookings. The specific data to ask from the client and how it should look like when
the booking is made (Response body)**
**Now I saw that I also needed to make a query to join two tables and get the name from the room table and return
a list with all the booking associated to that room**

**Which Spring Boot, JPA, validation, JPQL or OpenFeign concept became clearer after correcting my code? Give a specific example.**  
** I think the use of validation annotations became clearer. The use of DTO as well, but I still struggling why do I need
an object to access to a function call, why I cannot just call the function? From JPA I just learned that ON means ==.
But the how to read any query still hard for me to understand**
**What will I do differently in my next coding test or API development task?** 
**Practice. While I was doing this task I found so many gaps in my mind on how things work because I thought by knowing the
big picture would be enough. But simple things such as an object, entity, field, constructors I just forgot what they 
mean and how they work together. I also relly so much on AI. Because in the lab we get the code and the AI assistance 
completes the lines I am typing and gives the sense of "I know what I am doing" but without it, I don't. And when things 
are not working, or I get a bug I just throw the error to ChatGPT to fix and I just don't bother why it was giving the
error and why is the solution it suggests is valid. Let's say that I don't bother to understand or comprehend how things 
work. I definitely need to slow down and learn how to read the code, comprehend it and practice**

## Review lab assessment — 20 marks

- Honest original self-assessment with code evidence: **4 marks**
- Explanation of mistakes and Spring Boot concepts: **6 marks**
- Corrections in the new application: **4 marks**
- API testing and demonstration of understanding: **4 marks**
- Reflection and future improvement: **2 marks**

**Total: 20 marks.** Simply submitting a working solution does not demonstrate the learning required by this review.

## Proposed mark recovery — only if confirmed for CICD-1

If the same approach as OOP is adopted, the review could recover **up to 30% of marks lost** in the original examination, scaled by the review-lab mark.

**Marks recovered = (100 − official original exam mark) × 0.30 × (review lab mark ÷ 20)**

Example: exam **40/100** and review **16/20** → **14.4 recovered marks**, revised exam **54.4/100**. This is **not an approved CICD-1 policy unless confirmed by the lecturer**. The original official exam mark—not your self-awarded grade—is used in the calculation.

## Submission

Commit and push the **new review repository** with the completed README, corrected Spring Boot code and API-test evidence. Submit its GitHub URL on Moodle. **Do not push any changes to the original examination repository or `exam-work` pull request.**

1. Introduction
This Android application is a grading system for college students to find their grades based on their final marks.


Figure 1.0 – The home screen for the StudentGradingSystem application

The application gets the student ID, course name, and the total mark for the course, and calculates the grade based on the course grading scheme.


Figure 1.1 & 1.2 – The result for two courses for two different students


2. Conditions
As seen in the figures below, the student ID only accepts integer, and Total marks accepts double and integer by changing the inputType to number and numberDouble. And the text in course name is changed to uppercase when showing it in the TextView.


Figure 2.1 & 2.2 – The inputType for ID and marks editTexts


Figure 2.3 – course name field changes to uppercase










































3. Code


Figure 3.1 – Initializing the widgets



Figure 3.2 – Assigning the widgets and creating the onClickListener

Figure 3.4 – Creating the function to calculate the grade



Figure 3.5 – Creating string variables instead of hardcoding the texts














4. Design


Figure 4.1 – The design and component tree of the applicaton












5. XML Code


Figure 5.1 – The XML code for the design - 1

Figure 5.2 – The XML code for the design - 2


Figure 5.3 – The XML code for the design - 3




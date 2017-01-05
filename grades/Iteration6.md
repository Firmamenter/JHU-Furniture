#### Group Number: 16 Furniture

#### Presentation

- Good pitch!

##### App demo comments.  Did any errors/glitches arise during the demo?

- Good sign-up process but you spent far too much time on sign-up in the demo.
- "failed to create user" message appeared after going through all of the account creation steps.
- You had to show video of some of the main app functionality such as posting items etc.  You should have showed a live demo, see the final presentation requirements page.
- Overall you did not show that your app worked given the demo - the only operation you showed live, user creation, did not work in the end.
- Where did pictures get uploaded?  Did not see it in demo.
- Real data in your database for presentation. Nice.
- Using dates in international format =YYYY/MM/DD=. Nice.
- Why not use a service like Twilio to do phone verification? Seems restrictive
  to only allow certain carriers.


##### UI quality -- look and usability

 - Given that you guys are just learning Android you built a very nice-looking UI.
 
#### Iteration 6

##### Code inspection

- Don't pack things into the database by integer position:

```
 stmt.setInt(1, item.getSellerId());
            stmt.setString(2, item.getName());
            stmt.setString(3, item.getDesciption());
            stmt.setString(4, item.getImgLink());
```

- You took a very database approach to your app, your objects have no real methods on them:

```
/**
     * User adds items to their sell list.
     * @param item item to be added.
     */
    public void add (Item item) {
    }
```

- In general your code needs a lot of refactoring.

  
##### Architecture - was the code cleanly structured in terms of packages, deployment, etc

- Running on localhost in demo, you did not get your app deployed.
- Overall you had a simple architecture
- Your pom.xml file is broken, it will not build the jar file.  It does compile and run some tests though.

##### Tests - good coverage?  Travis working?

- Travis appears to not have been hooked up.
- Your back-end tests did not all work but you did also have many tests working -- good progress.

#### Project difficulty in terms of lines of code, conceptual difficulty, non-CRUD features, degree of completion

- Nice use of phone verification even though it is not so hard to do.
- You didn't really have any non-CRUD code but you did write a great deal of code in both front- and back-end.

#### Overall remarks

Your team clearly worked very hard on this project and it looks like you learned a great deal.   Your software engineering skills still need a great deal of work compared to your class-mates, the code in particular is in need of a great deal of refactoring.  Your demo did not show off a fully functioning app.

**Grade: 83/100**

# CS-320-16451-M01-Software-Test-Automation-QA-2026-C-2-Mar---Apr-
8-2 Journal: Portfolio Item

How can I ensure that my code, program, or software is functional and secure?

I like to start by getting all the info needed for what the application is. Talking with the stakeholders and or the director is important for obtaining a blueprint of what the team needs to write.
During these discussions, it's also important to talk about security right away. A blueprint with security and clear requirements will be needed for the team to start. It's also important that all team members uphold a security mindset when writing anything.

Testing needs to encompass normal and failure cases. Not just one. Testing automation, like Junit testing, is used to catch issues early before they manifest into a larger problem. Technical debt is something to avoid completely. "Measure twice, cut once".
Automated and manual tests need to be run every time there's been an update as well. Writing out bugs can create new ones in unexpected places. Automated tests quickly check a large amount of the application, even if it's a live service that can't be shut down.
Manual testing is still needed for quality assurance, bugs, and human interactions.

Every input value needs to be validated, even if the input is from an internal function. Never assume that a user can't modify data with the application in some way. Reject null values, invalid values, duplicate IDs, and bad data.
Even a user with no technical skills can still accidentally cause a buffer overflow or potentially other forms of corruption. Simple logic is also much easier to debug. Always review code before pushing or submitting it.
Write with no trust, assume nothing. Assumptions cause problems; all inputs should be parameterized and sterile. Keep software up to date and check databases on your dependencies for vulnerabilities. Dependencies should be trusted; do not use them recklessly.
The same goes for libraries as well.

Errors should be named and handled without exposing the internal workings of the application. You don't want to give attackers any clues about how to tamper with the application. Error codes are an industry practice for this reason; it is a form of encrypting the error.
Think like the attacker from a bias of each angle you can think of, and test your system around that. It's also good to be in the mindset of what an attacker could do in the code you're writing at that moment. How can an attacker misuse the feature you're writing?

I worked around this concept this term when writing an application and setting up Junit tests to check for security flaws, normal working code function along with negative. We checked for failure points as well. We used Google tests to check C++ and Maven to check Java.
I was taught about static testing in IDEs and how warnings should not be ignored. We also learned that the IDE isn't the only thing we should use when debugging or for checking security flaws.

How do I interpret user needs and incorporate them into a program?

I start by talking with the people who actually need the software. Stakeholders or managers requesting it usually know the problem they want solved, even if they don't explain it in technical terms. 
It's important to listen carefully, document, and then ask follow up questions so the real need is understood instead of making assumptions. A lot of times users explain what they want, but not what they actually need. 
That means I need to break requests down into clear requirements. If someone says they want the system to be faster, that can mean performance, easier workflow, better UI, or something better geared for the specific hardware. 
The real issue needs to be found first. You can't solve an equation without the math problem.

Once I get everything down into a clear blueprint and everyone approves of the design, I'll start my work as agreed on with the team. Large goals need to be organized in a hierarchical system with parents as the main goal, and children as sub goals.
This is a design that's good for everyone. It gives us a step by step process to solve the engineering problem that is the application. Sometimes this can be followed up with a Gantt chart or something similar. Clarity prevents bugs.
It's good to also think about how users could behave as well. Someone's cat could sleep on the keyboard and cause a terrible buffer overflow. Users often times don't read unless they need to. 
Detailed instructions could be skipped as users are more prone to make assumptions. The software should defend against all types of attacks, even accidental ones.

Testing also helps interpret user needs. If I can write a test for a requirement, then the requirement is probably clear enough to build. If I can't write a test for it, then I will need to find time to find out what those requirements are for sure.
I used this mindset during this course when converting assignment instructions into working Java and C++ projects. I had to read the requirements, break them down, and then turn them into code and test cases. 
Programming isn't just writing code; it's solving an engineering problem.

How do I approach designing software?

There's more to writing code than just writing code; it's solving an engineering problem.
You can think of it as building an equation. Writing the software is solving it. Just like any math problem, you break down complicated equations with something like PEMDAS. Break down big goals into smaller ones. Think about the scope early when making the blueprint!
Keep things simple. A simple project can expand later once made. A rushed one will only work to a degree and have limited expandability. Testing should also be part of the design process. 
If code is hard to test, it is usually a sign the design is too complicated. Clean and modular code is easier to unit test and maintain. Simple is always better; keep it as simple as possible at all times, minimal in, maximum out.

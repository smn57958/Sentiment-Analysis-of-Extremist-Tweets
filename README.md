# Project 3: Designing your first Amazon Mechanical Turk HIT

Design your first HIT using AMT Java SDK. In this project, you will need to use Twitter API to collect data and send your data set (min 100 tweets) that potentially contain any type of religious extremism.

	1. Ask workers to verify if a tweet contains extremism,
	2. why (justification),
	3. scale of extremism
	4. and their confidence score.
	5. Design you HIT GUI in a simple and user-friendly manner.
	6. For final classification use a consensus of at least three workers.

You can send your HITs to students in the class using AMT Sandbox. Optionally you can publish your HITs for actual crowd workers (paid) for undisclosed bonus points.
Programming language/environment: Amazon Mechanical Turk Java SDK (https://requester.mturk.com/developer).


## Prerequisites

Things you need to install the software

```
Java
```
```
Amazon Account
```
```
signed into workersandbox.mturk.com
```
```
signed into requestersandbox.mturk.com
```

### Running the tests

```
cmd/bash :> java -jar CodeBusters3.jar
```
Execute 'CodeBusters3.jar' in command prompt or bash shell after cd into the submission directory.

It will generate "Tweets.csv" file in the same directory with tweets.

Now open requestersandbox.mturk.com, sign in

```
Create "Sentiment of a tweet" project
```
```
Create GUI and assign 3 assignments per hit, $1.00 for worker.
```
```
Publish the project
```
```
Now click on "create" again and it will show your project, click on "publish" and upload "Tweets.csv" when asked 
```
```
Publish the batch and wait until it is fully published
```
```
Open workerssandbox.mturk.com and search for your project, most of the times typing in the author/creator will give you your project search.1
```

```
Generate hits and then open requestersandbox.mturk.com and check for results.
```
```
Download the resuls file, it will be similar to the one included in project Submission.
```

## Built With

* [Java](https://www.java.com/en/) - Programming language used to collect tweets and generate tweets.csv
* [Amazon Mechanical Turk](https://www.mturk.com/mturk/welcome) - Worker/Requester HITs

## Authors

* **Sohan M. Nipunage** 	- *Collecting,Generating tweets* 				     - [smn57958]	(smn57958@uga.edu)
* **Dnyanada D. Shirsat** 	- *Figuring Amazon Mechanical turk, designed GUI*	 - [dds69748]	(dds69748@uga.edu)
* **Niyati Shah** 			- *Helped in generating HITs* 						 - [nhs01063]	(nhs01063@uga.edu)
* **Akshay Agashe** 		- *Helped in generating HITs* 					 	 - [aa84678]	(aa84678@uga.edu)


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

# AWS and Cloud Computing

### Cloud Computing vs on premise
- Up until around 2006ish all computing was on premise
    - If you owned a large company and wanted your own website/IT infrastructure
    you had to buy it and house it yourself.
    - Buying physical hardware (cables, computers, server racks)
    - Building to house everything in
    - Pay for the electricity
    - Pay for the IT people and security
- Cloud computing
    - abstracting away all of the hardware and IT infrastructure to the internet
    - AWS, Azure, GCP, IBM, Oracle are all cloud providers
    - We will we take care of all your IT needs
- pros of cloud computing
    - Very fast startup time
        - If you need a web server that can host your websites it can be done in minutes
    - Low barrier to entry
        - A really small company can have a small software infrastucture and it is not expensive
    - Quickly Scale to meet demand
        - If your requests increase in demand you can scale to meet it
        - If your requests decrease you can shutdown servers you do not need
            - saves money
    - More developer friendly than on premise
        - specific tools for working with cloud resources
        - clouds will keep logs
        - nice UIs
        - Ready made resources like postgres databases
- cons of cloud computing
    - Do lose some really low level control over your machines
    - You can get tied to a specific provider
        - If your entire company runs on AWS trying to migrate out of AWS
    - Cloud computing does require a good internet connection

==================================================================================
## AWS 
- The biggest cloud provider in the world
- Provides a ton of differenct services

### EC2
- Elastic Computer Cloud
- Premiere AWS service
- IP address for EC2s are dynamically assigned
    - If you shut down an EC2 and restart it a a few hours later you might have a different IP address for that server.
- Virtual Machines in the cloud
- Main use is for web servers
    - They are general purpose computers that you can use for anything
- **AMI**
    - Amazon Machine Image
    - Snapshot of a computer that includes the OS and any files/programs/configuration on that computer
    - Every EC2 is created from an AMI
    - A template to create new instances from
- **EBS**
    - Elastic Block Store
    - Virtual harddrive
    - EBS cloned and reassigned
    - for example if you computer becomes underpowered for the job you can save the hard drive
    and attach to a new larger EC2

## S3
- Simple Storage Service
- Like Dropbox or Google Drive but with advanced developer capabilites and APIs
- A way to store files
    - You can literally store ANY files in S3
    - S3 terminology for file is **object**
- S3 is comprised of buckets
    - hold all your files
    - Must be globally unqiue
- One of the main uses is for Static website hosting
    - Hosting the frontend files like html/css/js
- Different versions of S3
- S3 Glacier
    - version of s3 where the objets are in cold storage
    - They take longer to retieve and you get charged more for interacting with these objects
    - REALLY cheap for just storing objects
    - Old scanned medical records

# DevOps
- The merging of DEVelopment of an application with the OPerationS of an applicaiton    
    - portmanteau of Development and Operations
- Development
    - Designing
    - Implementing
    - testing
- Operations 
    - Deploying the application for end users
    - Monitoring the application
    - Scaling the application based on requests
![Dev Ops](https://devopedia.org/images/article/54/7602.1513404277.png)
- Development should flow into operations and vice versa
    - Should be easy for new versions of the application to be quickly deployed
    - Should be easy for developers to get feedback on deployed applications

## CI
- Continous Integration
    - The process by which developers put code into a central repository
    - All about getting code **IN** to a central place
    - Often the code is automatically tested when put into a repo
## CD
- Continous Delivery
    - Extension of CI except a Deliverable is created and ususally put in a staging area
    - What is a deliverable?
        - Any finsished bundled piece of software/product
            - execuatable .jar file
            - Maybe a csv report that your AI software generated
            - Container(virual envrionment bunlded up in a file)
## CDD
- Continuous Deployment
    - Extension of continuous delivery
    - A deliverable is AUTOMATICLLY deployed to end users
    - Amazon does something like 2,000 software updates a day
        - That is because the entire process from developer to end user is automated
![Continuous integration](https://www.redhat.com/cms/managed-files/ci-cd-flow-desktop_1.png)

## CI tools
- Software that aids in creating a pipeline
- Pipeline is a series of automated steps
- Pipeline starts when code is pushed into a repo
    - every pipeline is different
- Pipeline is a generic term that the semantics might change on a project

## Jenkins
- CI tool
- Build Server
    - A program that is designed to build and test application
    - It can do automate other things
        - deploying the built application to another server
        - Run code linters

# Linux
- Operating System like Windows or ios
- Unix was an operating system that was developed in the 1970s by AT&T
    - The first really popular operating system
    - Designed for mainframe computers where many users shared a single machine
    - It was properitary and very expensive
- Linux was developed by Linus Torvalds
    - He also invented git btw
- Linux was a re-implementation of Unix but being open source and had a software license that said you could do anything you want with linux
- The very first linux OS is Debian
    - There are a few hundred different versions of linux that added new features or niche uses
- Why do developers and so many web servers use linux
    - linux distrubtions usually have no strings attached
        - free
        - can be modified
        - no legal concerns
    - linux tends be smaller in size and more efficent than windows
        - MacOS/iOS Apple is not super forthcoming with making there OS available
    - programs can run a little faster on a smaller machine
    - There is already so much software written for linux distros that trying to switch is not worth it.
- Linux normally does not have a graphical interface
    - Everything is done in text in terminal
- Linux commands
    - ls printing the directory contetns
    - pwd print working directory
    - cd change directory
    - grep
    - rm
    - sudo
    - kill
    - yum
    - mkdir
    - ps
    - touch
    - echo
    - bg
    - clear
    - cp
    - cat
    - vim
    - nano
    
    











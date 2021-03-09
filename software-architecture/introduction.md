# Software (Web Application) Architecture

## What is software architecture?
- Software Architecture (SA) of system describes its major components, their relationships, and how they interact with each other.
> It's the decisions you wish you could get right early in a project.

## Why is SA important?
- The key element in successfully creating anything is getting the base right.
- We don't always get things perfect at the first go.

## The difference between software architecture and software design
- SA is used to define the skeleton and the high-level components of a system, and how they will all work together.
- For example: Mircoservice architecture where the different features/tasks are split into separate respective modules/codebases?
- Choosing an architecture will determine how you deal with performance, fault tolerance, scalability, and reliability.

- Software design is responsible for the code level design such as, what each module is doing, the classes scope, and the functions purposes, etc.
- It can make a programmer significantly more efficient by allowing them to avoid resolving common problems.
- They also provide a useful common language to conceptualize repeated problems and solutions when discussing with others or managing code in larger teams.

## Software architecture patterns
- __Client-server__: works on a request-response model. The client sends the request to the server for information and the server responds with it.
- __Peer-to-Peer__: network in which computers also known as nodes can communicate with each other without the need of a central server.
    - The absence of a central server rules out the possibility of a single point of failure.
    - A node acts as seeder and a leecher at the same time. Even if some of the computers/nodes go down, the network and the communication is still up.
- __Model-View-Controller (MVC)__: 
    - Model: represent how data is stored in the database
    - Views: the components that are visible to the user, such as an output or a GUI
    - Controller: the components that act as an interface between models and views.
    - The MVC architecture is used not only for desktop apps but also for moblile and web apps.
- __Microservices architecture__: ifferent features/tasks are split into separate respective modules/codebases which work in conjunction with each other forming a large service as a whole.
- __Event driven__: non-blocking architecture is also known as the Reactive or the Event-driven architecture.
    - Capable of handling a big number of concurrent connections with minimal resource consumption.
    - Modern apps need a fully asynchronous model to scale. These modern web frameworks provide more reliable behaviour in a distributed environment.
- __Layered__: can be used to structure programs that can be decomposed into groups of subtasks, each of which is at a particular levele of abstraction.
    - Each layer provides services to next higher layer:
        - Presentation layer, application layer, bunsiness logic layer, data access layer.
- __Hexagonal__: consists of three components
    - Ports, adapters, domain
    - Make different components of the app independent, loosely coupled and easy to test.
    - The architecture pattern holds the domain at its core, that's the business logic. On the outside, the outer layer has Ports and Adapters.
    - Ports act like an API, as an interface.
    - All the input to the app goes through the interface.

## How to decide on the number of tiers
- __Single tier application__:
    - Pros:
        - No network latency
        - Data is quickly and easily available
        - Data is not transferred over a network which ensures data safety
    - Cons:
        - Little control over the app. It's hard to implement new features or code changes once it's shipped
        - Testing has to be extremely thorough with minimal room for mistakes
        - Single tier applications are vulnerable to being tweaked or reverse engineered
- __Two-tier application__:
    - Pros:
        - Fewer network calls since the code and UI are in the same machine
        - Database server and business logic is physically close, which offers higher performance.
    - Cons:
        - Since the client holds most of the application logic, problems arise in controlling the software version and re-distributing new versions.
        - Lacks scalability as it supports only a limited number of users. When multiple client requests increases, application performance can slow down due to the fact that clients necessitate separate connections and CPU memory to proceed.
        - Since the application logic is coupled with the client, it’s difficult to re-use logic.
- __Three-tier application__:
    - Pros:
        - Data corruption through client applications can be eliminated as the data passed in the middle tier for database updations ensures its validity
        - The placement of the business logic on a centralized server makes the data more secure
        - Due to the distributed deployment of application servers, scalability of the system is enhanced since a separate connection from each client is not required whereas connections from few application servers are sufficient.
    - Cons:
        - Usually more effort should be enforced when creating 3-tier applications as the communication points are increased (client to middle tier to server, instead of directly client to server).
- __N-Tier application__:
    - Pros:
        - All the pros of three-tier architecture
        - The performance is increased due to off-load from the database tier and the client tier, enabling it to suit medium to high volume industries.
    - Cons:
        - Due to the componentization of the tiers, the complex structure is difficult to implement or maintain

    **Conclusion**
    - You should choose a single tier architecture when you do not want any network latency
    - Choose a two tier application when you need to minimize network latency and you need more control of data within your application
    - You should choose a three tier architecture when you need control over the code/business logic of your application & want it to be secure, and you need control over data in your application.
    - You should choose a N tier architecture when you need your application to scale and handle large amounts of data.

## Horizontal or Vertical Scaling...
- A single server is enough to manage the traffic --> could go with vertical scaling when you know that the traffic load would not increase significantly.
- If your app have the traffic is expected to spike exponentially in the near future --> high availability and horizontal scalability is important.

## Monolith or Microservice?
- Monolithic applications fit best for use cases where the requirements are pretty simple, the app is expected to handle a limited amount of traffic.
- The microservice architecture fits best for complex use cases and for apps which expect traffic to increase exponentially in future like a fancy social network application.
- Starting with a monolithic architecture and then later scale out into a microservice architecture.

## Use NoSQL or SQL?
- SQL: store a lot of relationships
    - Transactions & Data Consistency
    - Storing Relationships
- NoSQL
    - Handling a large number of READ WRITE operations
    - Data analytics: deal with an influx of massive amounts of data

## Picking the technology
- Real time data interaction
    - To interact with the backend server in real-time, such as a messaging app, video streaming.
    - A persistent connection between the client and server, and non-blocking technology on the back-end
    - Some technologies: NodeJS, Tornado (Python), Spring Reactor, Play, and Akka.
- Peer-to-peer web application
    - P2P distributed search engine or a P2P Live TV radio service.
    - Tech: DAT, IPFS (Javascript), FreedomJS
- CRUD: Spring MVC, Django (Python), Laravel (PHP), ASP .NET MVC.
- CPU and Memory intensive
    - Tech commonly used in the industry to write performant, scalable, distributed systems is C++, Scala, Java.
    - Golang for multi-core machine and handling a large amount of data.

## Software Architect
- Most software engineers work for a few years before they take on designing architecture.
- Web apps: load balancing, message queueing, stream processing, caching.

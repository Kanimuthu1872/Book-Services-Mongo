FROM openjdk:17-oracle
COPY ./target/Book_Author-0.0.1-SNAPSHOT.jar book-author-registry.jar
CMD ["java","-jar","book-author-registry.jar"]
FROM amazoncorretto:17

RUN echo "$PWD"

COPY /app/target/app.jar /app.jar
COPY /Docker/run.sh /run.sh

ENTRYPOINT ["sh", "/run.sh"]
#EXPOSE 3000

#docker image build -t kubetraining:1.0 -f Docker/Dockerfile .
#docker run -d -p 8080:8085 kubetraining:1.0
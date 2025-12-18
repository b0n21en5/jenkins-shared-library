def call(String image, String imageTag){
  echo "Pushing image to the Docker Hub..."
  withCredentials([
      usernamePassword(
          'credentialsId':"dockerHubCred",
          passwordVariable:"dockerHubPass",
          usernameVariable:"dockerHubUser")]){
          sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
          sh "docker image tag notes-app:latest ${env.dockerHubUser}/${image}:${imageTag}"
          sh "docker push ${env.dockerHubUser}/${image}:${imageTag}"
  }
}

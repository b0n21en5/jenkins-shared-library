def call(String image, String imageTag, String dockerHubUser){
  sh "docker build -t ${image}:${imageTag} ."
  echo "Image build successfull.."
}

def call(String image, String imageTag){
  sh "docker build -t ${image}:${imageTag} ."
  echo "Image build successfull.."
}

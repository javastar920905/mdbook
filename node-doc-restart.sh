service=develop-doc
image=docker-registry:5000/${service}

serviceport=3000

docker rm -f ${service}
# docker images | grep none | awk '{print $3}' | xargs docker rmi -f
docker run -m 1G --name  ${service}  -p ${serviceport}:${serviceport} -v /root/openapi/develop-doc/docs:/usr/src/node/develop-doc/docs -t ${image}
# docker logs -f --tail 1000  ${service}


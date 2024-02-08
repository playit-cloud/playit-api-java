# delete old code
rm -rf ./src

java -jar openapi-generator-cli.jar generate \
  -i res/openapi.json \
  -g java \
  --http-user-agent playit-api-java \
  --api-name-suffix PlayitAPI \
  --additional-properties apiPackage=gg.playit.api \
  --additional-properties className=PlayitAPI \
  --additional-properties modelPackage=gg.playit.api.models \
  --additional-properties artifactId=playit-api-java \
  --additional-properties artifactUrl=https://github.com/playit-cloud/playit-api-java \
  --additional-properties developerName="Patrick Lorio" \
  --additional-properties developerOrganization="Developed Methods LLC" \
  --additional-properties developerOrganizationUrl="https://methods.dev" \
  -o ./

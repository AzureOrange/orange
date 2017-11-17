cd /xuehaiserver/packages 

today=`date +%Y%m%d`
LOCAL_IP=`/sbin/ifconfig -a|grep inet|grep -v 127.0.0.1|grep -v inet6|awk '{print $2}'|tr -d "addr:"`

process="cloudworkstatistic"

pid=$(ps -ef|grep -i ${process}.jar | grep -v "grep"|awk '{print $2}')

echo ${process} found at pid: $pid

if [ $pid != '' ]
then
  echo ${process} is stopping

  kill -9 $pid

  echo ${process} is stopped

  sleep 3
else
  echo There is no  ${process} started 
fi

echo
echo ${process} is starting

nohup java -jar -Dserver.ip=${LOCAL_IP} -Xms64m -Xmx512m ${process}.jar >> ../logs/cloudwork-server-$today.log 2>&1 &

sleep 5

pid=$(ps -ef|grep -i ${process}.jar | grep -v "grep"|awk '{print $2}')

echo ${process} started at pid: $pid



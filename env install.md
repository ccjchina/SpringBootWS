donet core



~~~bash
wget -qO- https://packages.microsoft.com/keys/microsoft.asc | gpg --dearmor > microsoft.asc.gpg
sudo mv microsoft.asc.gpg /etc/apt/trusted.gpg.d/
wget -q https://packages.microsoft.com/config/debian/9/prod.list
sudo mv prod.list /etc/apt/sources.list.d/microsoft-prod.list
sudo chown root:root /etc/apt/trusted.gpg.d/microsoft.asc.gpg
sudo chown root:root /etc/apt/sources.list.d/microsoft-prod.list

sudo apt-get update
sudo apt-get install dotnet-sdk-3.1
##END
dotnet --version
~~~





Docker

~~~bash
sudo apt-get remove docker docker-engine docker.io containerd runc

sudo apt-get update

sudo apt-get install \
    apt-transport-https \
    ca-certificates \
    curl \
    gnupg-agent \
    software-properties-common
    
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -


sudo apt-get update
sudo apt-get install docker-ce docker-ce-cli containerd.io
##END
dotnet --version

~~~



~~~bash
##环境
sudo docker pull redis
sudo docker pull ngix
sudo docker pull tomcat
~~~



Node

~~~bash
##安装
sudo apt-get install nodejs
sudo apt-get install npm

#源设置
npm --registry=https://registry.npm.taobao.org install

##安装cnpm命令,不会改变npm的源
npm install -g cnpm --registry=https://registry.npm.taobao.org

##使用 cnpm install

##Node 初始化项目
npm install -g vue-cli
####指定路径初始化项目
vue init webpack-simple my-project-name

##安装
npm install


##运行
npm run dev

##测试



~~~







防火墙

~~~bash
#deepin 
sudo apt install gufw
ufw all 8080                                                                   //刷新防火墙#使设置生效


# 查看规则、状态 【详细 | 序号】
sudo ufw status [verbose | numbered]
 
# 开启、关闭、重启、重置
sudo ufw enable | disable | reload | reset
 
# 日志 启动\关闭\级别
sudo ufw logging on | off | LEVEL
 
## 开放规则
 
# 允许使用53端口
sudo ufw allow 53
 
# 允许使用25端口,且为TCP协议
sudo ufw allow 25/tcp
 
# 允许smtp应用
sudo ufw allow smtp
 
# 允许http应用数据进入本机
sudo ufw allow in http
 
# 拒绝指向任意地址使用80端口tcp协议的数据进入本机
sudo ufw deny proto tcp to any port 80
 
# 允许来自192.168.0.0-192.168.255.255的数据通过eth0网卡进入主机
sudo ufw allow in on eth0 from 192.168.0.0/16
 
# 允许指向10.0.0.0-10.255.255.255的数据通过eth1网卡从本机发出
~~~


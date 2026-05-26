https://github.com/in28minutes/camel


---

How to Enable Docker By Powershell (Admin Mode) ? || FAILED So Bad

dism.exe /online /enable-feature /featurename:VirtualMachinePlatform /all /norestart
dism.exe /online /enable-feature /featurename:Microsoft-Windows-Subsystem-Linux /all /norestart
wsl --install
wsl --set-default-version 2

---

Prefer Old School Approach


---
Docker Run

docker run -p 8161:8161 rmohr/activemq
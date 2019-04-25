# github 初始化

## …or create a new repository on the command line
```
echo "# mdbook" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/javastar920905/mdbook.git
git push -u origin master
```
## …or push an existing repository from the command line
```
git remote add origin https://github.com/javastar920905/mdbook.git
git push -u origin master
```
## 移除现有origin
```
git remote -v
git remote remove origin
```

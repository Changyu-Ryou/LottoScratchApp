# LottoScratchApp
> [App] 복권 처럼 긁어서 랜덤 로또 번호를 알려주는 앱 for Android

  <br/><br/>
## ✨ summary
로또 번호 자동 추첨기로, 6개의 난수를 출력하고 그위에 Scratch Card View를 올림으로써 복권을 긁는 듯한 재미를 추가하였다.
  <br/><br/>
## 📖 Introduction  
로또의 경우 매주 추첨이 이루어지고, 관심을 가지고 있는 사람이 많은 만큼 꾸준한 사용자가 있고 그만큼 유입량과 광고 수익이 나올 것 같아서 제작하게 되었습니다. 로또 번호를 자동으로 골라주고 DB를 이용해 기기내에 저장하고 계속 볼 수 있도록 할 예정입니다. 전체적인 구현이 일찍 끝나면 QR 코드를 통한 로또 당첨결과 출력 기능 또한 추가할 예정입니다.
  <br/><br/>
## 👨‍💻 System requirements
기본적으로 Android Studio에서 JAVA언어 기반으로 개발을 진행합니다.  
이를위해 Android Studio 설치가 필수적입니다.  
또한 안드로이드 SDK Android 8.1 오레오 API Level 29를 타겟 API로 제작합니다.
  <br/><br/>
## 📝 Todo list
제작할 코드와 문서들입니다.

- [x] [💻] 메인 타이틀 (완료 ver 1.0)
- [x] [💻] 난수 출력부 구현 (완료 ver 1.0)
- [x] [💻] DB 구조 및 생성 (완료 ver 1.0)
- [x] [💻] 스크래치 기능 구현 (완료 ver 1.0)
- [x] [💻] DB 출력부 (완료 ver 1.0)
- [ ] [💻] DB 삭제 기능 - 미구현
- [ ] [📗] 셋팅부 구현 - 미구현
- [x] [📗] 난수 생성 구현 (완료 ver 1.0)
- [x] [📗] 수에 따른 배경 Shape와 color 구현 (완료 ver 1.0)
- [x] [🔨] 앱 전체적인 디자인 (완료 ver 1.1)
- [ ] [🔨] 로고 제작 
- [x] [🔨] 번호 생성 가능 횟수 제어 (완료 ver 1.2)
- [x] [🔒] google AdMob광고 배너 삽입  (완료 ver 1.1) 
- [x] [🔒] google AdMob광고 보상형 광고 삽입 (완료 ver 1.2)
- [ ] [🔓] Play Store 출시

  <br/> <br/>
  
## ☁️ Screen Shot
  
> ### ver 1.0 ( commit 2020-02-27 )  
메인 액티비티 구성 및 스크래치 기능 구현<br/>
난수 생성 기능 구현 <br/>
DB 관리 생성 <br/>
<img src="https://user-images.githubusercontent.com/56837413/75361280-6a7f0900-58fa-11ea-9b07-07e4d3434e4d.jpg" width="30%"></img> 
<img src="https://user-images.githubusercontent.com/56837413/75361284-6c48cc80-58fa-11ea-875d-6b6e12039422.jpg" width="30%"></img>
  
  <br/>
  <br/>
  <br/>
  
> ### ver 1.1 ( commit 2020-02-27 )  
전체적인 디자인 개선 <br/>
DB 출력 및 순서 변경 <br/>
ListView 갱신을 통한 DB 출력 <br/>
DB에 시간도 같이 저장 후 출력 <br/>
google AdMob 하단 배너 추가 <br/>
<img src="https://user-images.githubusercontent.com/56837413/75453270-03735a00-59b7-11ea-9833-23953ed83445.jpg" width="30%"></img> 
<img src="https://user-images.githubusercontent.com/56837413/75453276-05d5b400-59b7-11ea-8092-763921fb89f6.gif" width="30%"></img>
  
  <br/>
  <br/>
  <br/>
  
> ### ver 1.2 ( commit 2020-02-29 )  
보상형 광고 추가 <br/>
번호 생성가능 횟수 제어를 통해 광고유도 <br/>
<img src="https://user-images.githubusercontent.com/56837413/75564940-6dabfd80-5a90-11ea-8172-c2501290e0a1.jpg" width="30%"></img> 
<img src="https://user-images.githubusercontent.com/56837413/75564944-6e449400-5a90-11ea-9175-ecdc5bfda706.gif" width="30%"></img>
  
  <br/>
  <br/>
  <br/>
  




License about Scratch Card Library
-------

    Copyright 2017 MyInnos

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

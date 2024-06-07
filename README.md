# trace
tracing media flow


# 專案介紹

## 導入spring secruity。
實踐UserDetailsService - loadUserByUsername  

在用戶登入時會取得member相關的角色資料，並且賦予到User物件身上  
 
## 實作查詢單筆公司資料API  
用戶可以使用id查詢公司相關資料，並且會針對userDetails所帶有的角色去判讀是否擁有此存儲權限。

使用三層式架構  
CompanyController-負責接收用戶請求、轉發請求、產生數據並返回結果   
CompanyService-負責業務邏輯操作  
CompanyDAO-負責資料庫的持久化存取。








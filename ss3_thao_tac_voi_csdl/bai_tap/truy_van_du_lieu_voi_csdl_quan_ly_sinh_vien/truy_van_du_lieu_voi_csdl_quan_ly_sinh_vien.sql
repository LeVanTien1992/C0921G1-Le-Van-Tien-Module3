USE Quan_Ly_Sinh_Vien;

select *
from student
where StudentName like "H%"; 

select *
from class
where month(class.StartDate);

select *
from subject
where Credit between 3 and 5; 

update student
set student.ClassId = 2
where student.StudentId = 1;

SELECT S.StudentId, S.StudentName, Sub.SubName, M.Mark
FROM Student S join Mark M on S.StudentId = M.StudentId join Subject Sub on M.SubId = Sub.SubId
order by Mark DESC;